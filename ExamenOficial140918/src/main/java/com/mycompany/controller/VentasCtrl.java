package com.mycompany.controller;

import com.mycompany.controllerimpl.VentasCtrlImpl;
import com.mycompany.modell.Ventas;
import java.io.Serializable;
import java.util.ArrayList;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import com.mycompany.dao.VentasDAO;


@ManagedBean(name = "ventasCtrl")
@SessionScoped
public class VentasCtrl implements Serializable {

    private Ventas selected;
    private boolean est;
    VentasDAO catdao;
    private ArrayList<Ventas> list = new ArrayList<>();

    public VentasCtrl() {
        this.selected = new Ventas();
        this.catdao = new VentasCtrlImpl();
    }

    public void createVentas() {        
        if (catdao.createVentas(selected)) {
            System.out.println("Insertado");
        } else {
            System.out.println("Error al momento de insertar");
        }
    }

    public ArrayList<Ventas> getList() {
        list = catdao.readVentas();
        return list;
    }

    public void deleteVentas(String id){
        
        if (catdao.deleteVentas(id)) {
            System.out.println("Eliminado"+id);
        } else {
            System.out.println("Error al momento de eliminar");
        }
    }
    public Ventas getSelected() {
        return selected;
    }

    public void setSelected(Ventas selected) {
        this.selected = selected;
    }

}
