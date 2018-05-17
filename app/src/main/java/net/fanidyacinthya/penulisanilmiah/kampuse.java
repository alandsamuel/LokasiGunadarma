package net.fanidyacinthya.penulisanilmiah;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;

public class kampuse extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_kampuse);
    }
    public void informasi (View view) {
        Intent info = new Intent(this, kampuse.class);
        startActivity(info);
    }
    public void lokasi (View view) {
        Intent info = new Intent(this, mapse.class);
        startActivity(info);
    }
    public void kembali (View view) {
        Intent info = new Intent(this, menudepok.class);
        startActivity(info);
    }
    public void menuutama (View view) {
        Intent info = new Intent(this, menumasuk.class);
        startActivity(info);
    }
}
