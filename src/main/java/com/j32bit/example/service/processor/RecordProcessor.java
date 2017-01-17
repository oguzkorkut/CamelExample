package com.j32bit.example.service.processor;

import java.util.Map;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Just a demo bean to show we are ready to process each record polled from the
 * database.
 */
public class RecordProcessor implements Processor {

    static Logger log = LoggerFactory.getLogger(RecordProcessor.class);

    public void process(Exchange msg) {
        log.trace("Processing msg {}", msg);
        Map<String, Object> record = msg.getIn().getBody(Map.class);
        log.info("Processing record {}", record);
        // Do something useful with this record.
    }
}