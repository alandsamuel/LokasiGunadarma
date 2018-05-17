package net.fanidyacinthya.penulisanilmiah;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class menukalimalang extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menukalimalang);
    }

    public void kampusj1(View view) {
        Intent kmpsj1 = new Intent(this, kampusj1.class);
        startActivity(kmpsj1);
    }

    public void kampusj2(View view) {
        Intent kmpsj2 = new Intent(this, kampusj2.class);
        startActivity(kmpsj2);
    }

    public void kampusj3(View view) {
        Intent kmpsj3 = new Intent(this, kampusj3.class);
        startActivity(kmpsj3);
    }

    public void kampusj4(View view) {
        Intent kmpsj4 = new Intent(this, kampusj4.class);
        startActivity(kmpsj4);
    }

    public void kampusj5(View view) {
        Intent kmpsj5 = new Intent(this, kampusj5.class);
        startActivity(kmpsj5);
    }

    public void kembali(View view) {
        Intent kmbli = new Intent(this, daftarkampus.class);
        startActivity(kmbli);
    }

    public void menuutama(View view) {
        Intent mnutama = new Intent(this, menumasuk.class);
        startActivity(mnutama);
    }
}
