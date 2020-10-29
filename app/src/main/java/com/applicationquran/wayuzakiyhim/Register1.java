package com.applicationquran.wayuzakiyhim;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Register1 extends AppCompatActivity {
   Button btn_cen;
   Button btn_wal;
   Button btn_par;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register1);

        btn_cen=findViewById(R.id.Register1_butt_center);
        btn_wal=findViewById(R.id.Register1_butt_Wallet);
        btn_par=findViewById(R.id.Register1_butt_parentis);

        btn_cen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getBaseContext(),Register2.class);
                startActivity(intent);
            }
        });
        btn_wal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getBaseContext(),Register2.class);
                startActivity(intent);
            }
        });
        btn_par.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getBaseContext(),Register2.class);
                startActivity(intent);
            }
        });
    }
}
