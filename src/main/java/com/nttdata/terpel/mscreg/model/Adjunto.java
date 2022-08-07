package com.nttdata.terpel.mscreg.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Adjunto", propOrder = {"archivo"})
@XmlRootElement(name = "Adjunto")
public class Adjunto {

    @JsonProperty("Archivo")
    protected Archivo archivo;

    public Archivo getArchivoModel() {
        return archivo;
    }

    public void setArchivoModel(Archivo archivo) {
        this.archivo = archivo;
    }
}
