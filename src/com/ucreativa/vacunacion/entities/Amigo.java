package com.ucreativa.vacunacion.entities;

public class Amigo extends Persona{

    private String relacion;
    private String facebook;

    public Amigo(String nombre, String cedula, int edad, boolean riesgo, String relacion, String facebook) {
        super(nombre, cedula, edad, riesgo);
        this.relacion = relacion;
        this.facebook = facebook;
    }

    public static Amigo create(String nombre, String cedula, int edad, boolean riesgo, String relacion, String facebook){
        return new Amigo(nombre, cedula, edad, riesgo, relacion, facebook);
    }
    // <editor-fold desc="Metodos">
    public String getRelacion() {
        return relacion;
    }

    public void setRelacion(String relacion) {
        this.relacion = relacion;
    }

    public String getFacebook() {
        return facebook;
    }

    public void setFacebook(String facebook) {
        this.facebook = facebook;
    }
    // </editor-fold>
}
