package net.fanidyacinthya.penulisanilmiah;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;

public class menudepok extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_menudepok);
    }

    public void kampusd(View view) {
        Intent kmpsd = new Intent(this, kampusd.class);
        startActivity(kmpsd);
    }

    public void kampuse(View view) {
        Intent kmpse = new Intent(this, kampuse.class);
        startActivity(kmpse);
    }

    public void kampusg(View view) {
        Intent kmpsg = new Intent(this, kampusg.class);
        startActivity(kmpsg);
    }

    public void kampush(View view) {
        Intent kmpsh = new Intent(this, kampush.class);
        startActivity(kmpsh);
    }

    public void kampusf1(View view) {
        Intent kmpsf1 = new Intent(this, kampusf1.class);
        startActivity(kmpsf1);
    }

    public void kampusf4(View view) {
        Intent kmpsf4 = new Intent(this, kampusf4.class);
        startActivity(kmpsf4);
    }

    public void kampusf5(View view) {
        Intent kmpsf5 = new Intent(this, kampusf5.class);
        startActivity(kmpsf5);
    }

    public void kembali (View view) {
        Intent kmbli = new Intent(this, daftarkampus.class);
        startActivity(kmbli);
    }

    public void menuutama (View view) {
        Intent mnutma = new Intent(this, menumasuk.class);
        startActivity(mnutma);
    }

}






