package co.edu.usbcali.inmobiliaria.model;

public class EstadoPropiedad {
    private String nombre;
    private String descripcion;
    private Integer idEstadoPropiedad;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Integer getIdEstadoPropiedad() {
        return idEstadoPropiedad;
    }

    public void setIdEstadoPropiedad(Integer idEstadoPropiedad) {
        this.idEstadoPropiedad = idEstadoPropiedad;
    }
}
