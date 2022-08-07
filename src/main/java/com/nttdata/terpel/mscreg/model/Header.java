package com.nttdata.terpel.mscreg.model;

import lombok.Getter;
import lombok.Setter;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@Getter
@Setter
@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "Header")
public class Header {

    @XmlElement(name = "headerRequest", namespace = "https://www.terpel.com/integraciones/comunes/schemas/headerRequest/v1.0")
    protected HeaderRequest headerRequest;

}
