package edu.empleartec.ejemplolimpio;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class SaludoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_saludo);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        Intent exIntent=getIntent();
        String nameBeach=exIntent.getExtras().getString("playaNombre");
        Float tempBeach=exIntent.getExtras().getFloat("playaTemp");
        int imageBeach=exIntent.getExtras().getInt("playaImage");
        //String descBeach=exIntent.getExtras().getString("playaDesc");

        TextView textoSaludo = (TextView) findViewById(R.id.textBeach);
        textoSaludo.setText(nameBeach + " " + Float.toString(tempBeach));

        ImageView textoSaludo2 = (ImageView) findViewById(R.id.photoId);
        textoSaludo2.setImageResource(imageBeach);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
    }

}
