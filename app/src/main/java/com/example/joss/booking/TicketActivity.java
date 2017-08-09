package com.example.joss.booking;

import android.content.Intent;
import android.os.Handler;
import android.os.Message;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.w3c.dom.Text;

public class TicketActivity extends AppCompatActivity {

    TextView lbl_ticket4;
    TextView lbl_ticket5;
    TextView lbl_ticket6;
    TextView lbl_Ticket7;
    TextView lbl_Ticket8;
    TextView lbl_Ticket9;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ticket);

        final String idOrder = getIntent().getStringExtra("orderID");


        lbl_ticket4 = (TextView) findViewById(R.id.lbl_ticket4);
        lbl_ticket5 = (TextView) findViewById(R.id.lbl_ticket5);
        lbl_ticket6 = (TextView) findViewById(R.id.lbl_ticket6);
        lbl_Ticket7 = (TextView) findViewById(R.id.lbl_ticket7);
        lbl_Ticket8 = (TextView) findViewById(R.id.lbl_ticket8);
        lbl_Ticket9 = (TextView) findViewById(R.id.lbl_ticket9);

        final String[] labelComida = {""};
        final String[] labelPrecioU = {""};
        final String[] labelPrecioT = {""};
        final float[] sum = {0};

        final Handler messageHandler = new Handler() {
            public void handleMessage(Message msg) {
                float iva = (float) (sum[0] * 0.16);
                float megaTotal = sum[0] + iva;
                lbl_ticket4.setText(labelComida[0]);
                lbl_ticket5.setText(labelPrecioU[0]);
                lbl_ticket6.setText(labelPrecioT[0]);
                lbl_Ticket9.setText("Subtotal: "+ sum[0]);
                lbl_Ticket8.setText("IVA 16%: "+iva);
                lbl_Ticket7.setText("Total: "+megaTotal);

                Toast.makeText(getApplicationContext(), "Ticket Generated", Toast.LENGTH_SHORT).show();
            }
        };

        Thread test = new Thread(){
            public void run() {
                POST newPost = new POST();
                String getOrdenDetail = newPost.dataChange("setEndOrder",idOrder);
                String getTicket =  newPost.dataChange("getTicket",idOrder);

                try {

                    JSONArray jArray = new JSONArray(getTicket);
                    for(int i = 0; i < jArray.length(); i++){
                        Object tmpObjt = jArray.get(i);
                        JSONObject tmpJson = new JSONObject(tmpObjt.toString());
                        labelComida[0] = labelComida[0] + tmpJson.get("description").toString() + "\n";
                        labelPrecioU[0] = labelPrecioU[0] + tmpJson.get("PriceU").toString() + "\n";
                        labelPrecioT[0] = labelPrecioT[0] + tmpJson.get("PriceT").toString() + "\n";
                        sum[0] += Float.parseFloat(tmpJson.get("PriceT").toString());

                    }
//                    System.out.println(labelComida);
//                    System.out.println(labelPrecioU);
//                    System.out.println(labelPrecioT);
//                    System.out.println(sum);

                } catch (JSONException e) {

                }
                messageHandler.sendEmptyMessage(0);
            }
        };

        test.start();

    }
}
