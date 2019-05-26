package com.example.time;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

import java.io.DataOutputStream;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

public class AlertReciever extends BroadcastReceiver {
    public static String message;

    public void setMessage(String str){
        this.message = str;
    }

    @Override
    public void onReceive(Context context, Intent intent) {

            Thread thread = new Thread() {
                @Override
                public void run() {
                    try {
                        final String REQUEST_URL = "https://api.groupme.com/v3/bots/post";
                        final String botID = "d3a71228b287e357cc6a47da31";

                        String urlParameters = "bot_id=" + botID + "&text=" + message + "&param3=c";
                        try {
                            URL url = new URL(REQUEST_URL);
                            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
                            connection.setDoOutput(true);
                            connection.setDoInput(true);
                            connection.setInstanceFollowRedirects(false);
                            connection.setRequestMethod("POST");
                            connection.setUseCaches(false);

                            DataOutputStream wr = new DataOutputStream(connection.getOutputStream());
                            wr.writeBytes(urlParameters);
                            wr.flush();

                            int responseCode = connection.getResponseCode();
                            if (responseCode != 202)
                                System.out.println(responseCode + " error has occured while sending the message: " + message);
                        } catch (MalformedURLException e) {
                            System.out.println("Error occured while establishing a connection");
                            e.printStackTrace();
                        } catch (IOException e) {
                            System.out.println("Error occured while sending data");
                            e.printStackTrace();
                        }
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
            };

            thread.start();
        }
}
