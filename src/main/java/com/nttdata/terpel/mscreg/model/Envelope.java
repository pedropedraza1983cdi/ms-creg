package com.nttdata.terpel.mscreg.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.io.Serializable;

@Getter
@Setter
@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement( name = "Envelope")
public class Envelope implements Serializable {

    @JsonProperty("Header")
    @XmlElement(name = "Header")
    private Header header;

    @JsonProperty("Body")
    @XmlElement(name = "Body")
    private Body body;
}