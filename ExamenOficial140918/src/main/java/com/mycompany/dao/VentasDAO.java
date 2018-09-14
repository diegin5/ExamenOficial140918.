
package com.mycompany.dao;

import com.mycompany.modell.Ventas;
import java.util.ArrayList;

public interface VentasDAO {
    public boolean createVentas(Ventas ven);
    public ArrayList<Ventas> readVentas();
    public boolean updateVentas(Ventas ven);
    public boolean deleteVentas(String id);
    
}