package net.fanidyacinthya.penulisanilmiah;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class daftarkampus extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_daftarkampus);
    }

    public void kalimalang (View view) {
        Intent lanjutpage = new Intent(this, menukalimalang.class);
        startActivity(lanjutpage);
    }

    public void karawaci() {
        Intent krwci = new Intent(this, kampuskarawaci.class);
        startActivity(krwci);
    }
    public void cengkareng (View view) {
        Intent cngkrng = new Intent(this, kampuscengkareng.class);
        startActivity(cngkrng);
    }
    public void kenari (View view) {
        Intent knri = new Intent(this, kampuskenari.class);
        startActivity(knri);
    }
    public void depok (View view) {
        Intent dpk = new Intent(this, menudepok.class);
        startActivity(dpk);
    }
    public void simatupang (View view) {
        Intent smtpng = new Intent(this, kampussimatupang.class);
        startActivity(smtpng);
    }
    public void salemba (View view) {
        Intent slmba = new Intent(this, kampussalemba.class);
        startActivity(slmba);
    }
    public void kembali (View view) {
        Intent kmbli = new Intent(this, menumasuk.class);
        startActivity(kmbli);
    }
}
