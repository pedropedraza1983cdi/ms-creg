package com.nttdata.terpel.mscreg.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@Getter
@Setter
@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "Body")
public class Body {

    @JsonProperty("CargaDocumentoElectronicoERP_CREG")
    @XmlElement(name = "CargaDocumentoElectronicoERP_CREG", namespace = "http://tempuri.org/")
    private CargaDocumentoElectronicoERPcreg cargaDocumentoElectronicoERPcreg;

}
