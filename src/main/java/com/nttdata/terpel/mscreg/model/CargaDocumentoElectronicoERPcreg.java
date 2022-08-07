package com.nttdata.terpel.mscreg.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@Getter
@Setter
@XmlType(name = "CargaDocumentoElectronicoERP_CREG", propOrder = {"numeroCreg","clave","adjunto","compania","mensaje"})
@XmlRootElement(name = "CargaDocumentoElectronicoERP_CREG")
public class CargaDocumentoElectronicoERPcreg {

    @JsonProperty("Clave")
    protected String clave;

    @JsonProperty("Compania")
    protected String compania;

    @JsonProperty("NumeroCREG")
    protected String numeroCreg;

    @JsonProperty("Adjunto")
    protected Adjunto adjunto;

    @JsonProperty("mensaje")
    protected String mensaje;


    @XmlElement
    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    @XmlElement
    public String getCompania() {
        return compania;
    }

    public void setCompania(String compania) {
        this.compania = compania;
    }

    @XmlElement
    public String getNumeroCreg() {
        return numeroCreg;
    }

    public void setNumeroCreg(String numeroCreg) {
        this.numeroCreg = numeroCreg;
    }

    @XmlElement
    public Adjunto getAdjunto() {
        return adjunto;
    }

    public void setAdjunto(Adjunto adjunto) {
        this.adjunto = adjunto;
    }

    @XmlElement
    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }

}
