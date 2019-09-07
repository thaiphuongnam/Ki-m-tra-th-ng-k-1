package com.example.student.tpn_cau1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    CheckBox checkBox;
    Button buttonLogin;
    EditText editTextTK, editTextPass;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        buttonLogin = findViewById(R.id.buttonLogin);
        checkBox = findViewById(R.id.checkBox);
        editTextTK = findViewById(R.id.editTextTK);
        editTextPass = findViewById(R.id.editTextPass);
        buttonLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//                AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this);
//                builder.setMessage("B");
                String tk = editTextTK.getText().toString();
                String pass = editTextPass.getText().toString();
                if (!tk.isEmpty() && !pass.isEmpty()) {
                    if (checkBox.isChecked()) {
                        Toast.makeText(MainActivity.this, "Chào mừng bạn đăng nhập hệ thống, thông tin của bạn đã được lưu", Toast.LENGTH_LONG).show();
                    } else {
                        Toast.makeText(MainActivity.this, "Chào mừng bạn đăng nhập hệ thống, thông tin của bạn không được lưu", Toast.LENGTH_LONG).show();
                    }
                } else {
                    Toast.makeText(MainActivity.this, "Vui lòng nhập đủ tài khoản và mật khẩu", Toast.LENGTH_LONG).show();
                }

            }
        });
    }
}
