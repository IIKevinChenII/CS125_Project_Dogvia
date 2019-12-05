package com.example.cs125finalproject;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

public class EmailActivity extends AppCompatActivity {
    /**
     * the url of the API
     */
    private final String url = "https://dog.ceo/api/breeds/image/random";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_email);
// Instantiate the RequestQueue.
        RequestQueue queue = Volley.newRequestQueue(this);
        Button send = findViewById(R.id.sendBtn);
        send.setOnClickListener(unused -> {
            // Request a string response from the provided URL.
            StringRequest stringRequest = new StringRequest(Request.Method.GET, url,
                    new Response.Listener<String>() {
                        @Override
                        public void onResponse(String response) {
                            JsonParser parser = new JsonParser();
                            JsonElement element = parser.parse(response);
                            JsonObject object = (JsonObject) element;
                            String imageUrl = object.get("message").getAsString();

                        }
                    }, new Response.ErrorListener() {
                @Override
                public void onErrorResponse(VolleyError error) {

                }
            });
            queue.add(stringRequest);
        });
    }
}
