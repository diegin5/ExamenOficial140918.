
package com.mycompany.modell;

public class Ventas {

   public String id_ventas, nombres_razon_social, telefono, correo, dni_ruc;

    public Ventas(String id_ventas, String nombres_razon_social, String telefono, String correo, String dni_ruc) {
        this.id_ventas = id_ventas;
        this.nombres_razon_social = nombres_razon_social;
        this.telefono = telefono;
        this.correo = correo;
        this.dni_ruc = dni_ruc;
    }

    public Ventas() {
    }

    public String getId_ventas() {
        return id_ventas;
    }

    public void setId_ventas(String id_ventas) {
        this.id_ventas = id_ventas;
    }

    public String getNombres_razon_social() {
        return nombres_razon_social;
    }

    public void setNombres_razon_social(String nombres_razon_social) {
        this.nombres_razon_social = nombres_razon_social;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }
        public String getDni_ruc() {
        return dni_ruc;
    }

    public void setDni_ruc(String dni_ruc) {
        this.dni_ruc = dni_ruc;
    }
}