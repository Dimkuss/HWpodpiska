package com.example.hwpodpiska;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
    }
    private void init(){
        Button btnOK = findViewById(R.id.btnOK);
        Button btnClear = findViewById(R.id.btnClear);
        btnOK.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TextView txtInfo = findViewById(R.id.outputInfo);
                EditText txtName = findViewById(R.id.nameInputField);
                EditText txtEmail = findViewById(R.id.emailInputField);
                String info = "Подписка на рассылку успешно оформлена для пользователя "+txtName.getText()
                        +" на элетронный адрес " + txtEmail.getText();
                txtInfo.setText(info);
            }
        });
        btnClear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TextView txtInfo = findViewById(R.id.outputInfo);
                EditText txtName = findViewById(R.id.nameInputField);
                EditText txtEmail = findViewById(R.id.emailInputField);
                txtEmail.getText().clear();
                txtName.getText().clear();
                txtInfo.setText("");
            }
        });
    }
}