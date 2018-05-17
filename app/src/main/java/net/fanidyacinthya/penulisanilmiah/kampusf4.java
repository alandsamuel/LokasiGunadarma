package net.fanidyacinthya.penulisanilmiah;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;

public class kampusf4 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_kampusf4);
    }

    public void informasi(View view) {
        Intent info = new Intent(this, infokampusf4.class);
        startActivity(info);
    }

    public void lokasi(View view) {
        Intent lok = new Intent(this, mapsf4.class);
        startActivity(lok);
    }

    public void kembali(View view) {
        Intent kmbli = new Intent(this, menudepok.class);
        startActivity(kmbli);
    }

    public void menuutama(View view) {
        Intent mnutma = new Intent(this, menumasuk.class);
        startActivity(mnutma);
    }
}
