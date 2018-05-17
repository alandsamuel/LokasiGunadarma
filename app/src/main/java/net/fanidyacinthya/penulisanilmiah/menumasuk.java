package net.fanidyacinthya.penulisanilmiah;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class menumasuk extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menumasuk);
    }

    public void dftrkampus (View view) {
            Intent daftar = new Intent(this, daftarkampus.class);
            startActivity(daftar);
    }
    public void tentang (View view) {
        Intent ttg = new Intent(this, tentang.class);
        startActivity(ttg);
    }
    public void bantuan (View view) {
        Intent btn = new Intent(this, bantuan.class);
        startActivity(btn);
    }
    public void keluar (View view) {
        Intent klr = new Intent(this, maps.class);
        startActivity(klr);
    }
}
