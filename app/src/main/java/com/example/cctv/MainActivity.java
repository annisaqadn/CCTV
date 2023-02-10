package com.example.cctv;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.text.format.DateFormat;
import android.view.View;
import android.widget.TextView;

import java.util.Calendar;
import java.util.Date;

public class MainActivity extends AppCompatActivity {
    CardView cvTuguselamatdatang, cvBunderansiyono, cvAlunalun, cvSimpangrsud, cvBunderanPLN, cvSimpangamigo, cvJlNPlayen, cvJlManthous, cvSimpangplayen, cvSimpanggading, cvSimpangpatuk, cvJlBaronmulo, cvSimpangtrowono, cvPantaibaron, cvPantaikukup;
    TextView tvini;
    String hariIni;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        cvTuguselamatdatang = findViewById(R.id.cvTuguselamatdatang);
        cvBunderansiyono = findViewById(R.id.cvBunderansiyono);
        cvAlunalun = findViewById(R.id.cvAlunalun);
        cvSimpangrsud = findViewById(R.id.cvSimpangrsud);
        cvBunderanPLN = findViewById(R.id.cvBunderanPLN);
        cvSimpangamigo = findViewById(R.id.cvSimpangamigo);
        cvJlNPlayen = findViewById(R.id.cvJlPlayen);
        cvJlManthous = findViewById(R.id.cvJlManthous);
        cvSimpangplayen = findViewById(R.id.cvSimpangplayen);
        cvSimpanggading = findViewById(R.id.cvSimpanggading);
        cvSimpangpatuk = findViewById(R.id.cvSimpangpatuk);
        cvJlBaronmulo = findViewById(R.id.cvJlBaron);
        cvSimpangtrowono = findViewById(R.id.cvSimpangtrowono);
        cvPantaibaron = findViewById(R.id.cvPantaiBaron);
        cvPantaikukup = findViewById(R.id.cvPantaiKukup);
        tvini = findViewById(R.id.tvDate);
        getToday();

        cvTuguselamatdatang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this, TSD.class);
                startActivity(i);
            }
        });
        cvBunderansiyono.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this, BS.class);
                startActivity(i);
            }
        });
        cvAlunalun.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this, AAW.class);
                startActivity(i);
            }
        });
        cvSimpangrsud.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this, SRSUD.class);
                startActivity(i);
            }
        });
        cvBunderanPLN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this, BPLN.class);
                startActivity(i);
            }
        });
        cvSimpangamigo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this, SA.class);
                startActivity(i);
            }
        });
        cvJlNPlayen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this, JNP.class);
                startActivity(i);
            }
        });
        cvJlManthous.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this, JMP.class);
                startActivity(i);
            }
        });
        cvSimpangplayen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this, SP.class);
                startActivity(i);
            }
        });
        cvSimpanggading.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this, SG.class);
                startActivity(i);
            }
        });
        cvSimpangpatuk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this, SPatuk.class);
                startActivity(i);
            }
        });
        cvJlBaronmulo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this, JBM.class);
                startActivity(i);
            }
        });
        cvSimpangtrowono.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this, ST.class);
                startActivity(i);
            }
        });
        cvPantaibaron.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this, PB.class);
                startActivity(i);
            }
        });
        cvPantaikukup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this, PK.class);
                startActivity(i);
            }
        });
    }
    //membuat parameter untuk fungsi Date
    private void getToday() {
        Date date = Calendar.getInstance().getTime();
        String hari = (String) DateFormat.format("EEEE", date);
        String tanggal = (String) DateFormat.format("dd", date);
        String bulan = (String) DateFormat.format("MMMM", date);
        String tahun = (String) DateFormat.format("yyyy", date);
        String formatFix = hari + ", " + tanggal + " " + bulan + " " + tahun;
        tvini.setText(formatFix);
    }
}