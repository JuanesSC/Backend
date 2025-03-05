package co.edu.usbcali.inmobiliaria.model;

public class Propiedad {
    private Integer idPropietario;
    private Integer idAsesor;
    private Integer idTipoPropiedad;
    private Integer idEstadoPropiedad;
    private String direccion;
    private String ciudad;
    private Integer codigoPostal;
    private Integer metrosCuadrados;
    private Integer habitaciones;
    private Integer banos;
    private Double precio;
    private String fechaCreacion;
    private Integer idPropiedad;

    public Integer getIdPropietario() {
        return idPropietario;
    }

    public void setIdPropietario(Integer idPropietario) {
        this.idPropietario = idPropietario;
    }

    public Integer getIdAsesor() {
        return idAsesor;
    }

    public void setIdAsesor(Integer idAsesor) {
        this.idAsesor = idAsesor;
    }

    public Integer getIdTipoPropiedad() {
        return idTipoPropiedad;
    }

    public void setIdTipoPropiedad(Integer idTipoPropiedad) {
        this.idTipoPropiedad = idTipoPropiedad;
    }

    public Integer getIdEstadoPropiedad() {
        return idEstadoPropiedad;
    }

    public void setIdEstadoPropiedad(Integer idEstadoPropiedad) {
        this.idEstadoPropiedad = idEstadoPropiedad;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public Integer getCodigoPostal() {
        return codigoPostal;
    }

    public void setCodigoPostal(Integer codigoPostal) {
        this.codigoPostal = codigoPostal;
    }

    public Integer getMetrosCuadrados() {
        return metrosCuadrados;
    }

    public void setMetrosCuadrados(Integer metrosCuadrados) {
        this.metrosCuadrados = metrosCuadrados;
    }

    public Integer getHabitaciones() {
        return habitaciones;
    }

    public void setHabitaciones(Integer habitaciones) {
        this.habitaciones = habitaciones;
    }

    public Integer getBanos() {
        return banos;
    }

    public void setBanos(Integer banos) {
        this.banos = banos;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    public String getFechaCreacion() {
        return fechaCreacion;
    }

    public void setFechaCreacion(String fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }

    public Integer getIdPropiedad() {
        return idPropiedad;
    }

    public void setIdPropiedad(Integer idPropiedad) {
        this.idPropiedad = idPropiedad;
    }
}
