package com.mycompany.controllerimpl;

import com.mycompany.modell.Ventas;
import com.mycompany.configbd.Conexionbd;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import com.mycompany.dao.VentasDAO;


public class VentasCtrlImpl implements VentasDAO {

    Conexionbd cx;
    String sql;
    ResultSet rs;
    ArrayList<Ventas> listDatos;

    public VentasCtrlImpl() {
        cx = new Conexionbd();
    }

    @Override
    public boolean createVentas(Ventas cat) {
        sql = "INSERT INTO public.ventas(id_ventas, nombres_razon_social, telefono, correo, dni_ruc) "
                + "VALUES("+cat.getId_ventas()+",'"+cat.getNombres_razon_social()+"','"+cat.getTelefono()+"','"+cat.getCorreo()+"','"+cat.getDni_ruc()+"')";
        return cx.executeInsertUpdate(sql);
    }

    @Override
    public ArrayList<Ventas> readVentas() {
        listDatos = new ArrayList<>();
        sql = "SELECT id_ventas, nombres_razon_social, telefono, correo, dni_ruc "
                + "    FROM public.ventas";
        rs = cx.executeQuery(sql);
        try {
            while (rs.next()) {
                listDatos.add(new Ventas(rs.getString("id_ventas"),rs.getString("nombres_razon_social"), rs.getString("telefono"), rs.getString("correo"), rs.getString("dni_ruc")));
            }

        } catch (SQLException ex) {
            Logger.getLogger(VentasCtrlImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        return listDatos;
    }

    @Override
    public boolean updateVentas(Ventas cat) {
        sql = "UPDATE public.ventas SET "
                + " nombres_razon_social = '"+cat.getNombres_razon_social()+"', telefono = '"+cat.getTelefono()+"', correo = '"+cat.getCorreo()+"', dni_ruc = '"+cat.getDni_ruc()+"' "
                + "WHERE id_ventas = "+cat.getId_ventas()+" ";
        return cx.executeInsertUpdate(sql);
    }

    @Override
    public boolean deleteVentas(String id) {
        sql = "DELETE FROM public.ventas "
                + "WHERE id_ventas = "+id+" ";
        return cx.executeInsertUpdate(sql);
    }

}
