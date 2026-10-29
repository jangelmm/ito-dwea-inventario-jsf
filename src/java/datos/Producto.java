package datos;

public class Producto {
    
    private String descripcion;
    private double existencia;
    private double precio;
    private String categoria;
    private String proveedor;
    private boolean importado;

    public Producto() {}

    public Producto(String descripcion, double existencia, double precio, String categoria, String proveedor, boolean importado) {
        this.descripcion = descripcion;
        this.existencia = existencia;
        this.precio = precio;
        this.categoria = categoria;
        this.proveedor = proveedor;
        this.importado = importado;
    }

    // Dato calculado requerido
    public double getValor() {
        return this.existencia * this.precio;
    }

    public String getDescripcion() { return descripcion; }
    public void setDescripcion(String descripcion) { this.descripcion = descripcion; }
    public double getExistencia() { return existencia; }
    public void setExistencia(double existencia) { this.existencia = existencia; }
    public double getPrecio() { return precio; }
    public void setPrecio(double precio) { this.precio = precio; }
    public String getCategoria() { return categoria; }
    public void setCategoria(String categoria) { this.categoria = categoria; }
    public String getProveedor() { return proveedor; }
    public void setProveedor(String proveedor) { this.proveedor = proveedor; }
    public boolean isImportado() { return importado; }
    public void setImportado(boolean importado) { this.importado = importado; }
}