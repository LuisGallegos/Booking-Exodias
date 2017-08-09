package com.example.joss.booking;

import org.apache.http.HttpResponse;
import org.apache.http.NameValuePair;
import org.apache.http.client.HttpClient;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.message.BasicNameValuePair;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by iamth on 7/12/2017.
 */

public class POST {

    public String dataChange(String peticion, String parametro){
        String result = null;
        BufferedReader in = null;
        try{
            HttpClient client =  new DefaultHttpClient();
            HttpPost request = new HttpPost("http://192.168.0.111:8080/Cheng/Proyecto/mainPresenter.php");
//            HttpPost request = new HttpPost("http://10.16.38.166:8080/Cheng/Proyecto/mainPresenter.php");

            List<NameValuePair> params = new ArrayList<NameValuePair>();

            params.add(new BasicNameValuePair("request", peticion));
            params.add(new BasicNameValuePair("params", parametro));

            UrlEncodedFormEntity formEntity = new UrlEncodedFormEntity(params);
            request.setEntity(formEntity);
            HttpResponse response = client.execute(request);
            in = new BufferedReader(new InputStreamReader(response.getEntity().getContent()));
            StringBuffer sb = new StringBuffer("");
            String line = "";
            String NL = System.getProperty("line.separator");
            while ((line = in.readLine()) != null){
                sb.append(line + NL);
            }
            in.close();
            result = sb.toString();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return result;
    }

}
