package org.talend.component.beam.kafka.source;

import java.io.Serializable;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.json.JsonBuilderFactory;
import javax.json.JsonObject;


import org.talend.sdk.component.api.configuration.Option;
import org.talend.sdk.component.api.input.Producer;
import org.talend.sdk.component.api.meta.Documentation;

import org.talend.component.beam.kafka.service.Component_beam_kafkaService;

@Documentation("TODO fill the documentation for this source")
public class KafkaInputSource implements Serializable {
    private final KafkaInputMapperConfiguration configuration;
    private final Component_beam_kafkaService service;
    private final JsonBuilderFactory jsonBuilderFactory;

    public KafkaInputSource(@Option("configuration") final KafkaInputMapperConfiguration configuration,
                        final Component_beam_kafkaService service,
                        final JsonBuilderFactory jsonBuilderFactory) {
        this.configuration = configuration;
        this.service = service;
        this.jsonBuilderFactory = jsonBuilderFactory;
    }

    @PostConstruct
    public void init() {
        // this method will be executed once for the whole component execution,
        // this is where you can establish a connection for instance
    }

    @Producer
    public JsonObject next() {
        // this is the method allowing you to go through the dataset associated
        // to the component configuration
        //
        // return null means the dataset has no more data to go through
        // you can use the jsonBuilderFactory to create new JsonObjects.
        return null;
    }

    @PreDestroy
    public void release() {
        // this is the symmetric method of the init() one,
        // release potential connections you created or data you cached
    }
}