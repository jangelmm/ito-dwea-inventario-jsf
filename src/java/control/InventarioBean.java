package control;

import datos.Producto;
import jakarta.inject.Named;
import jakarta.enterprise.context.SessionScoped;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Named("inventario")
@SessionScoped
public class InventarioBean implements Serializable {

    private Producto nuevoProducto = new Producto();
    private List<Producto> listaProductos = new ArrayList<>();

    public InventarioBean() {
        // Datos de prueba
        listaProductos.add(new Producto("Producto X", 10.0, 5.0, "Nacional", "Proveedor Local", false));
        listaProductos.add(new Producto("Producto Y", 0.0, 3.0, "Extranjero", "Proveedor Mayorista", true));
    }

    public Producto getNuevoProducto() { return nuevoProducto; }
    public void setNuevoProducto(Producto nuevoProducto) { this.nuevoProducto = nuevoProducto; }

    public String agregarProducto() {
        listaProductos.add(nuevoProducto);
        nuevoProducto = new Producto(); // Reinicia el formulario para la pestaña original
        
        // Redirige a la nueva página de resultados
        return "resultados?faces-redirect=true"; 
    }

    // Regla de negocio: Omite los que tienen existencia en 0
    public List<Producto> getProductosVisibles() {
        return listaProductos.stream()
                             .filter(p -> p.getExistencia() > 0)
                             .collect(Collectors.toList());
    }
}