package edu.empleartec.ejemplolimpio;

import android.content.Context;
import android.content.Intent;
import android.media.Image;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

/**
 * Created by gcalero1984 on 12/18/15.
 */
public class PlayasListAdapter extends BaseAdapter {

    private final List<Playa> source;
    private final Context context;

    public PlayasListAdapter(Context context, List<Playa> source) {
        this.context = context;
        this.source = source;
    }

    @Override
    public int getCount() {
        return source.size();
    }

    @Override
    public Object getItem(int position) {
        return source.get(position);
    }

    @Override
    public long getItemId(int position) {
        return getItem(position).hashCode();
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        View layout = LayoutInflater.from(context).inflate(R.layout.item_lista, parent, false);

        TextView textTemperatura = (TextView) layout.findViewById(R.id.text_temperatura);
        TextView textNombre = (TextView) layout.findViewById(R.id.text_nombre);
        ImageView imagePhoto = (ImageView) layout.findViewById(R.id.photoId);

        final Playa playa = (Playa) getItem(position);
        textTemperatura.setText(String.valueOf(playa.getTemperatura()));
        textNombre.setText(playa.getNombre());
        imagePhoto.setImageResource(playa.getPhotoId());

        layout.setOnClickListener(new View.OnClickListener()
        { public  void onClick(View v){
                                          Intent anIntent = new Intent(context,SaludoActivity.class);
                                          anIntent.putExtra("playaNombre",playa.getNombre());
                                          anIntent.putExtra("playaTemp",playa.getTemperatura());
                                          anIntent.putExtra("playaImage",playa.getPhotoId());

                                          context.startActivity(anIntent);
                                          //startActivity(new Intent(MainActivity.this, StandingsActivity.class));

                                      }


                                  }
        );

/*
            button.setOnClickListener(new View.OnClickListener() {
        public void onClick(View v) {
            startActivity(new Intent(MainActivity.this,StandingsActivity.class));
        }
    });


*/
        return layout;
    }
}
