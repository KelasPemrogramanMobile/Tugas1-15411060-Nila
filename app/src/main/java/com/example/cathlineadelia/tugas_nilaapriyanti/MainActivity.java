package com.example.cathlineadelia.tugas_nilaapriyanti;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {

    @BindView(R.id.edNama) EditText edNama;
    @BindView(R.id.edNpm) EditText edNpm;
    @BindView(R.id.edNilaiTugas) EditText edNilaiTugas;
    @BindView(R.id.edNilaiQuis) EditText edNilaiQuis;
    @BindView(R.id.edNilaiUts) EditText edNilaiUts;
    @BindView(R.id.edNilaiUas) EditText edNilaiUas;

    @BindView(R.id.TxtTampil1) TextView TxtTampil1;
    @BindView(R.id.TxtTampil2) TextView TxtTampil2;
    @BindView(R.id.TxtTampil3) TextView TxtTampil3;
    @BindView(R.id.TxtTampil4) TextView TxtTampil4;
    @BindView(R.id.TxtTampil5) TextView TxtTampil5;
    @BindView(R.id.TxtTampil6) TextView TxtTampil6;

    @OnClick(R.id.btnInput)
    void input (){
        String nama = edNama.getText().toString();
        String npm = edNpm.getText().toString();
        String nilaitugas = edNilaiTugas.getText().toString();
        String nilaiquis = edNilaiQuis.getText().toString();
        String nilaiuts = edNilaiUts.getText().toString();
        String nilaiuas = edNilaiUas.getText().toString();
        String tampil = "Nama: " + nama + ", "
                + "NPM: " + npm + ", "
                + "Nilai Tugas: " + nilaitugas + ", "
                + "Nilai Quis:  " + nilaiquis + ", "
                + "Nilai UTS: " + nilaiuts + ", "
                + "Nilai UAS: " + nilaiuas;
        Toast.makeText(getApplicationContext(), tampil, Toast.LENGTH_LONG).show();
        TxtTampil1.setText(nama);
        TxtTampil2.setText(npm);
        TxtTampil3.setText(nilaitugas);
        TxtTampil4.setText(nilaiquis);
        TxtTampil5.setText(nilaiuts);
        TxtTampil6.setText(nilaiuas);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

    }
}
