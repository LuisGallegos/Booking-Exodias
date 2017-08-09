package com.example.joss.booking;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/**
 * Created by Joss on 11/07/2017.
 */

public class ReservaActivity extends Activity {
    EditText Jtxt_ownerOrder;
    ///// Bebidas
    EditText Jtxt_cafe;
    EditText Jtxt_chocolate;
    EditText Jtxt_te;
    EditText Jtxt_lecheAzul;
    EditText Jtxt_health;
    EditText Jtxt_limonada;
    EditText Jtxt_fanta;
    EditText Jtxt_pisto;
    EditText Jtxt_mana;
    EditText Jtxt_licuados;

    TextView lbl_cafe;
    TextView lbl_chocolate;
    TextView lbl_te;
    TextView lbl_lecheAzul;
    TextView lbl_health;
    TextView lbl_limonada;
    TextView lbl_fanta;
    TextView lbl_pisto;
    TextView lbl_mana;
    TextView lbl_licuados;

    ///// platillos
    EditText Jtxt_waffles;
    EditText Jtxt_webos;
    EditText Jtxt_hotcakes;
    EditText Jtxt_moyetes;
    EditText Jtxt_tacos;
    EditText Jtxt_enchilaculos;
    EditText Jtxt_torta;
    EditText Jtxt_peshuga;
    EditText Jtxt_lomo;
    EditText Jtxt_newYork;

    TextView lbl_waffles;
    TextView lbl_webos;
    TextView lbl_hotcakes;
    TextView lbl_moyetes;
    TextView lbl_tacos;
    TextView lbl_enchilaculos;
    TextView lbl_torta;
    TextView lbl_peshuga;
    TextView lbl_lomo;
    TextView lbl_newYork;


    ///// Postres
    EditText Jtxt_flan;
    EditText Jtxt_gelatina;
    EditText Jtxt_pie;
    EditText Jtxt_pastel;
    EditText Jtxt_galleta;

    TextView lbl_flan;
    TextView lbl_gelatina;
    TextView lbl_pie;
    TextView lbl_pastel;
    TextView lbl_galleta;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reserva);

        final String idNewOrder = getIntent().getStringExtra("newOrder");
        final String idOrderAction = getIntent().getStringExtra("orderAction");

        Jtxt_ownerOrder = (EditText) findViewById(R.id.txt_orderOwner);
        /// BEBIDAS
        Jtxt_cafe = (EditText)findViewById(R.id.bebida3);
        Jtxt_chocolate = (EditText)findViewById(R.id.bebida2);
        Jtxt_te = (EditText)findViewById(R.id.bebida1);
        Jtxt_lecheAzul = (EditText)findViewById(R.id.bebida4);
        Jtxt_health = (EditText)findViewById(R.id.bebida5);
        Jtxt_limonada = (EditText)findViewById(R.id.bebida6);
        Jtxt_fanta = (EditText)findViewById(R.id.bebida7);
        Jtxt_pisto = (EditText)findViewById(R.id.bebida8);
        Jtxt_mana = (EditText)findViewById(R.id.bebida9);
        Jtxt_licuados = (EditText)findViewById(R.id.bebida10);

        final EditText [] Bebidas = new EditText[10];
        Bebidas[0] = Jtxt_cafe;
        Bebidas[1] = Jtxt_chocolate;
        Bebidas[2] = Jtxt_te;
        Bebidas[3] = Jtxt_lecheAzul;
        Bebidas[4] = Jtxt_health;
        Bebidas[5] = Jtxt_limonada;
        Bebidas[6] = Jtxt_fanta;
        Bebidas[7] = Jtxt_pisto;
        Bebidas[8] = Jtxt_mana;
        Bebidas[9] = Jtxt_licuados;

        lbl_cafe = (TextView) findViewById(R.id.lbl_bebida1);
        lbl_chocolate = (TextView) findViewById(R.id.lbl_bebida2);
        lbl_te = (TextView) findViewById(R.id.lbl_bebida3);
        lbl_lecheAzul = (TextView) findViewById(R.id.lbl_bebida4);
        lbl_health = (TextView) findViewById(R.id.lbl_bebida5);
        lbl_limonada = (TextView) findViewById(R.id.lbl_bebida6);
        lbl_fanta = (TextView) findViewById(R.id.lbl_bebida7);
        lbl_pisto = (TextView)findViewById(R.id.lbl_bebida8);
        lbl_mana = (TextView)findViewById(R.id.lbl_bebida9);
        lbl_licuados = (TextView)findViewById(R.id.lbl_bebida10);

        final TextView [] BebidasText = new TextView[10];
        BebidasText[0] = lbl_cafe;
        BebidasText[1] = lbl_chocolate;
        BebidasText[2] = lbl_te;
        BebidasText[3] = lbl_lecheAzul;
        BebidasText[4] = lbl_health;
        BebidasText[5] = lbl_limonada;
        BebidasText[6] = lbl_fanta;
        BebidasText[7] = lbl_pisto;
        BebidasText[8] = lbl_mana;
        BebidasText[9] = lbl_licuados;


        ///// platillos
        Jtxt_waffles = (EditText)findViewById(R.id.comida1);
        Jtxt_webos = (EditText)findViewById(R.id.comida2);
        Jtxt_hotcakes = (EditText)findViewById(R.id.comida3);
        Jtxt_moyetes = (EditText)findViewById(R.id.comida4);
        Jtxt_tacos = (EditText)findViewById(R.id.comida5);
        Jtxt_enchilaculos = (EditText)findViewById(R.id.comida6);
        Jtxt_torta = (EditText)findViewById(R.id.comida7);
        Jtxt_peshuga = (EditText)findViewById(R.id.comida8);
        Jtxt_lomo = (EditText)findViewById(R.id.comida9);
        Jtxt_newYork = (EditText)findViewById(R.id.comida10);

        final EditText [] Platillos = new EditText[10];
        Platillos[0] = Jtxt_waffles;
        Platillos[1] = Jtxt_webos;
        Platillos[2] = Jtxt_hotcakes;
        Platillos[3] = Jtxt_moyetes;
        Platillos[4] = Jtxt_tacos;
        Platillos[5] = Jtxt_enchilaculos;
        Platillos[6] = Jtxt_torta;
        Platillos[7] = Jtxt_peshuga;
        Platillos[8] = Jtxt_lomo;
        Platillos[9] = Jtxt_newYork;

        lbl_waffles = (TextView) findViewById(R.id.lbl_comida1);
        lbl_webos = (TextView) findViewById(R.id.lbl_comida2);
        lbl_hotcakes = (TextView) findViewById(R.id.lbl_comida3);
        lbl_moyetes = (TextView) findViewById(R.id.lbl_comida4);
        lbl_tacos = (TextView) findViewById(R.id.lbl_comida5);
        lbl_enchilaculos = (TextView) findViewById(R.id.lbl_comida6);
        lbl_torta = (TextView) findViewById(R.id.lbl_comida7);
        lbl_peshuga = (TextView)findViewById(R.id.lbl_comida8);
        lbl_lomo = (TextView)findViewById(R.id.lbl_comida9);
        lbl_newYork = (TextView)findViewById(R.id.lbl_comida10);

        final TextView [] PlatillosText = new TextView[10];
        PlatillosText[0] = lbl_waffles;
        PlatillosText[1] = lbl_webos;
        PlatillosText[2] = lbl_hotcakes;
        PlatillosText[3] = lbl_moyetes;
        PlatillosText[4] = lbl_tacos;
        PlatillosText[5] = lbl_enchilaculos;
        PlatillosText[6] = lbl_torta;
        PlatillosText[7] = lbl_peshuga;
        PlatillosText[8] = lbl_lomo;
        PlatillosText[9] = lbl_newYork;

        ///// Postres
        Jtxt_flan = (EditText)findViewById(R.id.postre1);
        Jtxt_gelatina = (EditText)findViewById(R.id.postre2);
        Jtxt_pie = (EditText)findViewById(R.id.postre3);
        Jtxt_pastel = (EditText)findViewById(R.id.postre4);
        Jtxt_galleta = (EditText)findViewById(R.id.postre5);

        final EditText [] Postres = new EditText[5];
        Postres[0] = Jtxt_flan;
        Postres[1] = Jtxt_gelatina;
        Postres[2] = Jtxt_pie;
        Postres[3] = Jtxt_pastel;
        Postres[4] = Jtxt_galleta;


        lbl_flan = (TextView) findViewById(R.id.lbl_postres1);
        lbl_gelatina = (TextView) findViewById(R.id.lbl_postres2);
        lbl_pie = (TextView) findViewById(R.id.lbl_postres3);
        lbl_pastel = (TextView) findViewById(R.id.lbl_postres4);
        lbl_galleta = (TextView) findViewById(R.id.lbl_postres5);

        final TextView [] PostresText = new TextView[5];
        PostresText[0] = lbl_flan;
        PostresText[1] = lbl_gelatina;
        PostresText[2] = lbl_pie;
        PostresText[3] = lbl_pastel;
        PostresText[4] = lbl_galleta;

        final Button Jbtn_guardar = (Button)findViewById(R.id.btn_Send);

        if(idNewOrder != null){
            System.out.println("NEW ORDER");
            Jtxt_ownerOrder.setEnabled(true);

            final Handler messageHandler3 = new Handler() {
                public void handleMessage(Message msg) {
                    Toast.makeText(getApplicationContext(), "Order Saved: "+idNewOrder+"", Toast.LENGTH_SHORT).show();
                }
            };

            Jbtn_guardar.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    new Thread(new Runnable() {
                        @Override
                        public void run() {
                            POST newPost = new POST();
                            JSONObject params = new JSONObject();
                            try {
                                params.put("name",Jtxt_ownerOrder.getText().toString());
                                params.put("id", idNewOrder);
                            } catch (JSONException e) {
                                e.printStackTrace();
                            }
                            String saveOrderOwner = newPost.dataChange("setOwner",params.toString());

                            for (int i = 0; i < Bebidas.length; i++){
                                //System.out.println(Bebidas[i].getText().toString().length());
                                if (Bebidas[i].getText().toString().length() > 0) {
                                    JSONObject tmpJsonBebidas = new JSONObject();
                                    try {
                                        tmpJsonBebidas.put("name",BebidasText[i].getText().toString());
                                        tmpJsonBebidas.put("idOrden",idNewOrder);
                                        tmpJsonBebidas.put("cantidad",Bebidas[i].getText().toString());
//                                        System.out.println(tmpJsonBebidas);
                                        String saveOrderDetail = newPost.dataChange("setDetailBebidas",tmpJsonBebidas.toString());
//                                        System.out.print(saveOrderDetail);
                                    } catch (JSONException e){
                                        e.printStackTrace();
                                    }
                                }
                            }

                            for (int i = 0; i < Platillos.length; i++){
                                //System.out.println(Bebidas[i].getText().toString().length());
                                if (Platillos[i].getText().toString().length() > 0) {
                                    JSONObject tmpJsonComidas = new JSONObject();
                                    try {
                                        tmpJsonComidas.put("name",PlatillosText[i].getText().toString());
                                        tmpJsonComidas.put("idOrden",idNewOrder);
                                        tmpJsonComidas.put("cantidad",Platillos[i].getText().toString());
                                        System.out.println(tmpJsonComidas);
                                        String saveOrderDetail = newPost.dataChange("setDetailComidas",tmpJsonComidas.toString());
                                    } catch (JSONException e){
                                        e.printStackTrace();
                                    }
                                }
                            }

                            for (int i = 0; i < Postres.length; i++){
                                //System.out.println(Bebidas[i].getText().toString().length());
                                if (Postres[i].getText().toString().length() > 0) {
                                    JSONObject tmpJsonPostres = new JSONObject();
                                    try {
                                        tmpJsonPostres.put("name",PostresText[i].getText().toString());
                                        tmpJsonPostres.put("idOrden",idNewOrder);
                                        tmpJsonPostres.put("cantidad",Postres[i].getText().toString());
                                        System.out.println(tmpJsonPostres);
                                        String saveOrderDetail = newPost.dataChange("setDetailPostres",tmpJsonPostres.toString());
                                    } catch (JSONException e){
                                        e.printStackTrace();
                                    }
                                }
                            }

                            String saveOrdenTotal = newPost.dataChange("setTotal",idNewOrder);
                            System.out.println(saveOrdenTotal);
                            messageHandler3.sendEmptyMessage(0);

                        }
                    }).start();

                }
            });

        }else if(idOrderAction != null){
            System.out.println("UPDATE ORDER");
            Jtxt_ownerOrder.setEnabled(false);
            final JSONArray[] jArray = {new JSONArray()};

            final Handler messageHandler = new Handler() {
                public void handleMessage(Message msg) {
                    try {
                        for (int i = 0; i < jArray[0].length(); i++) {
                            Object tmpObjt = jArray[0].get(i);
                            JSONObject tmpJson = new JSONObject(tmpObjt.toString());
                            System.out.println(tmpJson.toString());
                            for (int j = 0; j < Bebidas.length; j++) {
                                if (BebidasText[j].getText().toString().equals(tmpJson.get("name"))) {
                                    Bebidas[j].setText(tmpJson.get("cantidad").toString());
                                    System.out.println(tmpJson.get("cantidad").toString());
                                }
                            }

                            for (int j = 0; j < Platillos.length; j++) {
                                if (PlatillosText[j].getText().toString().equals(tmpJson.get("name"))) {
                                    Platillos[j].setText(tmpJson.get("cantidad").toString());
                                    System.out.println(tmpJson.get("cantidad").toString());
                                }
                            }

                            for (int j = 0; j < Postres.length; j++) {
                                if (PostresText[j].getText().toString().equals(tmpJson.get("name"))) {
                                    Postres[j].setText(tmpJson.get("cantidad").toString());
                                    System.out.println(tmpJson.get("cantidad").toString());
                                }
                            }
                            Jtxt_ownerOrder.setText(tmpJson.get("nombre").toString());
                            System.out.println(tmpJson.get("nombre").toString());
                        }
                    } catch (JSONException e) {
                        e.printStackTrace();
                    }

                    Toast.makeText(getApplicationContext(), "Ticket Generated", Toast.LENGTH_SHORT).show();
                }
            };

             new Thread(new Runnable() {
                 @Override
                 public void run() {
                     POST newPost = new POST();
                     String getOrdenDetail = newPost.dataChange("getOrdenDetail",idOrderAction);
                     try {
                         jArray[0] = new JSONArray(getOrdenDetail);

                     } catch (JSONException e) {
                         e.printStackTrace();
                     }
                     String deleteOrdenDetail = newPost.dataChange("deleteOrdenDetail",idOrderAction);
                     messageHandler.sendEmptyMessage(0);
                 }
             }).start();


            final Handler messageHandler2 = new Handler() {
                public void handleMessage(Message msg) {
                    Toast.makeText(getApplicationContext(), "Order Updated", Toast.LENGTH_SHORT).show();
                }
            };

            Jbtn_guardar.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    new Thread(new Runnable() {
                        @Override
                        public void run() {
                            POST newPost = new POST();

                            for (int i = 0; i < Bebidas.length; i++){
                                //System.out.println(Bebidas[i].getText().toString().length());
                                if (Bebidas[i].getText().toString().length() > 0) {
                                    JSONObject tmpJsonBebidas = new JSONObject();
                                    try {
                                        tmpJsonBebidas.put("name",BebidasText[i].getText().toString());
                                        tmpJsonBebidas.put("idOrden",idOrderAction);
                                        tmpJsonBebidas.put("cantidad",Bebidas[i].getText().toString());
//                                        System.out.println(tmpJsonBebidas);
                                        String saveOrderDetail = newPost.dataChange("setDetailBebidas",tmpJsonBebidas.toString());
//                                        System.out.print(saveOrderDetail);
                                    } catch (JSONException e){
                                        e.printStackTrace();
                                    }
                                }
                            }

                            for (int i = 0; i < Platillos.length; i++){
                                //System.out.println(Bebidas[i].getText().toString().length());
                                if (Platillos[i].getText().toString().length() > 0) {
                                    JSONObject tmpJsonComidas = new JSONObject();
                                    try {
                                        tmpJsonComidas.put("name",PlatillosText[i].getText().toString());
                                        tmpJsonComidas.put("idOrden",idOrderAction);
                                        tmpJsonComidas.put("cantidad",Platillos[i].getText().toString());
//                                        System.out.println(tmpJsonComidas);
                                        String saveOrderDetail = newPost.dataChange("setDetailComidas",tmpJsonComidas.toString());
                                    } catch (JSONException e){
                                        e.printStackTrace();
                                    }
                                }
                            }

                            for (int i = 0; i < Postres.length; i++){
                                //System.out.println(Bebidas[i].getText().toString().length());
                                if (Postres[i].getText().toString().length() > 0) {
                                    JSONObject tmpJsonPostres = new JSONObject();
                                    try {
                                        tmpJsonPostres.put("name",PostresText[i].getText().toString());
                                        tmpJsonPostres.put("idOrden",idOrderAction);
                                        tmpJsonPostres.put("cantidad",Postres[i].getText().toString());
//                                        System.out.println(tmpJsonPostres);
                                        String saveOrderDetail = newPost.dataChange("setDetailPostres",tmpJsonPostres.toString());
                                    } catch (JSONException e){
                                        e.printStackTrace();
                                    }
                                }
                            }
                            String saveOrdenTotal = newPost.dataChange("setTotal",idOrderAction);
                            messageHandler2.sendEmptyMessage(0);
                        }
                    }).start();

                }
            });

        }

    }
}