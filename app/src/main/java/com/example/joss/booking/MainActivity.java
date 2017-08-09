package com.example.joss.booking;

import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.Message;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText JTxt_idActualizar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final Button JBtn_nueva = (Button) findViewById(R.id.btn_NuevaOrden);
        final Button JBtn_borrar = (Button) findViewById(R.id.btn_elimiarOrden);
        final Button JBtn_actualizar = (Button) findViewById(R.id.btn_actualizarOrden);
        final Button JBtn_Ticket = (Button) findViewById(R.id.btn_ticket);

        final Handler messageHandler = new Handler() {
            public void handleMessage(Message msg) {
                Toast.makeText(getApplicationContext(), "Order Deleted", Toast.LENGTH_SHORT).show();
                JTxt_idActualizar.setText("");
            }
        };

        JBtn_borrar.setEnabled(false);
        JBtn_actualizar.setEnabled(false);
        JBtn_Ticket.setEnabled(false);

        JTxt_idActualizar = (EditText) findViewById(R.id.txt_idActualizar);
        JTxt_idActualizar.addTextChangedListener(new TextWatcher() {
            @Override
            public void afterTextChanged(Editable arg0) {
                boolean isReady = JTxt_idActualizar.getText().toString().length()>0;
                JBtn_borrar.setEnabled(isReady);
                JBtn_actualizar.setEnabled(isReady);
                JBtn_Ticket.setEnabled(isReady);
            }

            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {
            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
            }
        });

        JBtn_nueva.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent reservaAc = new Intent(v.getContext(), activity_newOrden.class);
                startActivity(reservaAc);
            }
        });

        JBtn_borrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                new Thread(new Runnable() {
                    @Override
                    public void run() {
                        POST newPost = new POST();
                        String deleteOrden = newPost.dataChange("deleteOrder",JTxt_idActualizar.getText().toString());
                        messageHandler.sendEmptyMessage(0);
                    }
                }).start();

            }
        });

        JBtn_actualizar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent reservaAc = new Intent(MainActivity.this, ReservaActivity.class);
                reservaAc.putExtra("orderAction",JTxt_idActualizar.getText().toString());
                startActivity(reservaAc);
            }
        });

        JBtn_Ticket.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent TicketAc = new Intent(MainActivity.this, TicketActivity.class);
                TicketAc.putExtra("orderID",JTxt_idActualizar.getText().toString());
                startActivity(TicketAc);
            }
        });


    }



}
