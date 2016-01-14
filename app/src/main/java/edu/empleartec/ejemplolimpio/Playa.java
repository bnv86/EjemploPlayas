package edu.empleartec.ejemplolimpio;

/**
 * Created by gcalero1984 on 12/18/15.
 */
public class Playa {

    private String nombre;

    private float temperatura;

    //private String descripcion;

    private int photoId;

    public Playa(String unNombre, float unaTemperatura, int photoId) {
        this.nombre = unNombre;
        this.temperatura = unaTemperatura;
        this.photoId = photoId;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public float getTemperatura() {
        return temperatura;
    }

    public void setTemperatura(float temperatura) {
        this.temperatura = temperatura;
    }


    public int getPhotoId(){
        return this.photoId;
    }

    public void setPhotoId(int photoId){
        this.photoId = photoId;
    }

    /*public String getDescripcion(){
        return descripcion;
        }

    public void setDescripcion(String descripcion){
        this.descripcion = descripcion;
    }*/

    @Override
    public String toString() {
        return getNombre() + " (" +getTemperatura()+")" + getPhotoId();
    }
}
