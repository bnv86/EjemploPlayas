package edu.empleartec.ejemplolimpio;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        String appName = getResources().getString(R.string.app_name);


        List<Playa> playas = new ArrayList<>();

        playas.add(new Playa("Playa del Carmen", 22.3f, R.drawable.beach0));
        playas.add(new Playa("Mar del Plata", 33.3f, R.drawable.beach1));
        playas.add(new Playa("Hermenejildo", 36.3f, R.drawable.beach2));
        playas.add(new Playa("Carilo", 22.3f,R.drawable.beach3 ));
        playas.add(new Playa("La otra", 12.3f,R.drawable.beach4 ));
        playas.add(new Playa("Claromecó", 88.3f,R.drawable.beach5 ));
        playas.add(new Playa("Cancun", 38.3f,R.drawable.beach6 ));
        playas.add(new Playa("Buzios", 52.3f,R.drawable.beach7 ));
        playas.add(new Playa("Buzios", 52.3f,R.drawable.beach8 ));
        playas.add(new Playa("Buzios 10", 52.3f,R.drawable.beach9 ));
        playas.add(new Playa("Buzios 11", 52.3f, R.drawable.beach10));
        playas.add(new Playa("Buzios 12", 52.3f,R.drawable.beach11 ));
        playas.add(new Playa("Buzios 13", 52.3f,R.drawable.beach12 ));
        playas.add(new Playa("Buzios 14", 52.3f,R.drawable.beach13 ));

        PlayasListAdapter miAdapter = new PlayasListAdapter(this, playas);

        ListView miLista = (ListView) findViewById(R.id.mi_lista);
        miLista.setAdapter(miAdapter);



    }

}
