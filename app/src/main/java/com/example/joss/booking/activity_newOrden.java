package com.example.joss.booking;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import org.apache.http.HttpResponse;
import org.apache.http.NameValuePair;
import org.apache.http.client.HttpClient;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.message.BasicNameValuePair;
import org.json.JSONArray;
import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class activity_newOrden extends AppCompatActivity {

    String newOrden = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new_orden);

        final Button JBtn_desayuno = (Button) findViewById(R.id.desayuno);
        final Button JBtn_comida = (Button) findViewById(R.id.comida);
        final Button JBtn_cena = (Button) findViewById(R.id.cena);
        
        JBtn_desayuno.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                new Thread(new Runnable() {
                    @Override
                    public void run() {
                        POST newPost = new POST();
                        String data = newPost.dataChange("insertOrder","1");
                        System.out.println(data);
//                        if (data.length()>0){
                        try {
                            JSONArray jArray = new JSONArray(data);
                            Object tmpObjt = jArray.get(0);
                            JSONObject tmpJson = new JSONObject(tmpObjt.toString());
                            newOrden = tmpJson.get("id").toString();

                            Intent reservaAc = new Intent(activity_newOrden.this, ReservaActivity.class);
                            reservaAc.putExtra("newOrder",newOrden);
                            startActivity(reservaAc);

//                            for(int i = 0; i < jArray.length(); i++){
//                                Object tmpObjt = jArray.get(i);
//                                JSONObject tmpJson = new JSONObject(tmpObjt.toString());
//                                System.out.println(tmpJson.get("id_Bebidas"));
//                                System.out.println(tmpJson.get("name"));
//                                System.out.println(tmpJson.get("price"));
//
//                            }

                        } catch (Exception e) {
                            e.printStackTrace();
                        }
//                            thread_check.sendEmptyMessage(1);
//                        }
                    }
                }).start();

            }
        });

        JBtn_comida.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                new Thread(new Runnable() {
                    @Override
                    public void run() {
                        POST newPost = new POST();
                        String data = newPost.dataChange("insertOrder","2");
                        System.out.println(data);
//                        if (data.length()>0){
                        try {
                            JSONArray jArray = new JSONArray(data);
                            Object tmpObjt = jArray.get(0);
                            JSONObject tmpJson = new JSONObject(tmpObjt.toString());
                            newOrden = tmpJson.get("id").toString();

                            Intent reservaAc = new Intent(activity_newOrden.this, ReservaActivity.class);
                            reservaAc.putExtra("newOrder",newOrden);
                            startActivity(reservaAc);

//                            for(int i = 0; i < jArray.length(); i++){
//                                Object tmpObjt = jArray.get(i);
//                                JSONObject tmpJson = new JSONObject(tmpObjt.toString());
//                                System.out.println(tmpJson.get("id_Bebidas"));
//                                System.out.println(tmpJson.get("name"));
//                                System.out.println(tmpJson.get("price"));
//
//                            }

                        } catch (Exception e) {
                            e.printStackTrace();
                        }
//                            thread_check.sendEmptyMessage(1);
//                        }
                    }
                }).start();
            }
        });

        JBtn_cena.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                new Thread(new Runnable() {
                    @Override
                    public void run() {
                        POST newPost = new POST();
                        String data = newPost.dataChange("insertOrder","3");
                        System.out.println(data);
//                        if (data.length()>0){
                        try {
                            JSONArray jArray = new JSONArray(data);
                            Object tmpObjt = jArray.get(0);
                            JSONObject tmpJson = new JSONObject(tmpObjt.toString());
                            newOrden = tmpJson.get("id").toString();

                            Intent reservaAc = new Intent(activity_newOrden.this, ReservaActivity.class);
                            reservaAc.putExtra("newOrder",newOrden);
                            startActivity(reservaAc);

//                            for(int i = 0; i < jArray.length(); i++){
//                                Object tmpObjt = jArray.get(i);
//                                JSONObject tmpJson = new JSONObject(tmpObjt.toString());
//                                System.out.println(tmpJson.get("id_Bebidas"));
//                                System.out.println(tmpJson.get("name"));
//                                System.out.println(tmpJson.get("price"));
//
//                            }

                        } catch (Exception e) {
                            e.printStackTrace();
                        }
//                            thread_check.sendEmptyMessage(1);
//                        }
                    }
                }).start();
            }
        });
    }
}
