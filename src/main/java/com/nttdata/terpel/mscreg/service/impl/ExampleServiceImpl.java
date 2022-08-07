package com.nttdata.terpel.mscreg.service.impl;

import com.nttdata.terpel.mscreg.model.Envelope;
import com.nttdata.terpel.mscreg.service.ExampleService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class ExampleServiceImpl implements ExampleService {

    @Override
    public ResponseEntity<Object> constructExample(Envelope request) {

        Envelope envelopeObj = request;
        log.info(String.valueOf(envelopeObj));
        return new ResponseEntity<>(envelopeObj, HttpStatus.OK);
    }

}