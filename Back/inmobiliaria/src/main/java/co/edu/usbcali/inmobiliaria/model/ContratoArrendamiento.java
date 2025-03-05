package co.edu.usbcali.inmobiliaria.model;

public class ContratoArrendamiento {
    private Integer idEstadoContrato;
    private Integer idPropiedad;
    private Integer idArrendatario;
    private Integer idAsesor;
    private String fechaInicio;
    private String fechaFin;
    private Double rentaMensual;
    private Double deposito;
    private Integer idContratoArrendamiento;

    public Integer getIdEstadoContrato() {
        return idEstadoContrato;
    }

    public void setIdEstadoContrato(Integer idEstadoContrato) {
        this.idEstadoContrato = idEstadoContrato;
    }

    public Integer getIdPropiedad() {
        return idPropiedad;
    }

    public void setIdPropiedad(Integer idPropiedad) {
        this.idPropiedad = idPropiedad;
    }

    public Integer getIdArrendatario() {
        return idArrendatario;
    }

    public void setIdArrendatario(Integer idArrendatario) {
        this.idArrendatario = idArrendatario;
    }

    public Integer getIdAsesor() {
        return idAsesor;
    }

    public void setIdAsesor(Integer idAsesor) {
        this.idAsesor = idAsesor;
    }

    public String getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(String fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public String getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(String fechaFin) {
        this.fechaFin = fechaFin;
    }

    public Double getRentaMensual() {
        return rentaMensual;
    }

    public void setRentaMensual(Double rentaMensual) {
        this.rentaMensual = rentaMensual;
    }

    public Double getDeposito() {
        return deposito;
    }

    public void setDeposito(Double deposito) {
        this.deposito = deposito;
    }

    public Integer getIdContratoArrendamiento() {
        return idContratoArrendamiento;
    }

    public void setIdContratoArrendamiento(Integer idContratoArrendamiento) {
        this.idContratoArrendamiento = idContratoArrendamiento;
    }
}
