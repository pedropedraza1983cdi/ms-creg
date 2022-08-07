package com.nttdata.terpel.mscreg.service;

import com.nttdata.terpel.mscreg.model.Envelope;
import org.springframework.http.ResponseEntity;

public interface ExampleService {

    ResponseEntity<Object> constructExample(Envelope request);

}