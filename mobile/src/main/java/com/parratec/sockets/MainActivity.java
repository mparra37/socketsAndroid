package com.parratec.sockets;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import java.net.Socket;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class MainActivity extends AppCompatActivity {
    Button boton;
    EditText textField;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        boton = (Button) findViewById(R.id.button);
        textField = (EditText) findViewById(R.id.editText);
    }

    public void enviar(View v) throws IOException{


        String msg = textField.getText().toString();


        Client myClient = new Client("192.168.0.10", 9898, msg);
        myClient.execute();

        textField.setText("");


    }
}
