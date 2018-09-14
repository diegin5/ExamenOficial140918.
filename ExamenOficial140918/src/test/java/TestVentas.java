
import com.mycompany.controllerimpl.VentasCtrlImpl;
import com.mycompany.dao.VentasDAO;
import com.mycompany.modell.Ventas;
import java.util.ArrayList;

public class TestVentas {
    static ArrayList<Ventas> list = new ArrayList<>();
    
    public static void main(String[] args) {
        VentasDAO catdao;
        catdao = new VentasCtrlImpl();
        /*list = catdao.readCategoria();
        for(Categoria item: list){
            System.out.println(""+item.getName_cat());
        }*/
        Ventas cat = new Ventas();
        cat.setId_ventas("3");
        cat.setNombres_razon_social("upeu");
            cat.setTelefono("946372622");
        cat.setCorreo("anuma@www.com");
        cat.setDni_ruc("71275485");
        if(catdao.createVentas(cat)){
            System.out.println("insertado");
        }else{
            System.out.println("error al momento de insertar");
        }
    }
    
}