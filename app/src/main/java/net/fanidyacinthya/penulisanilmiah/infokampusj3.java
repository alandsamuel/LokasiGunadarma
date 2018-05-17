package net.fanidyacinthya.penulisanilmiah;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class infokampusj3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_infokampusj3);
    }

    public void kembali (View view) {
        Intent kmbli = new Intent(this, kampusj3.class);
        startActivity(kmbli);
    }

    public void menuutama (View view) {
        Intent mnutma = new Intent(this, menumasuk.class);
        startActivity(mnutma);
    }
}
