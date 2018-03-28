package org.talend.component.beam.kafka.source;

import java.io.Serializable;

import org.talend.sdk.component.api.configuration.Option;
import org.talend.sdk.component.api.configuration.ui.layout.GridLayout;
import org.talend.sdk.component.api.meta.Documentation;

@GridLayout({
    // the generated layout put one configuration entry per line,
    // customize it as much as needed
    @GridLayout.Row({ "brokers" }),
    @GridLayout.Row({ "offset" })
})
@Documentation("TODO fill the documentation for this configuration")
public class KafkaInputMapperConfiguration implements Serializable {
    @Option
    @Documentation("TODO fill the documentation for this parameter")
    private String brokers;

    @Option
    @Documentation("TODO fill the documentation for this parameter")
    private OffsetConfiguration offset;

    public String getBrokers() {
        return brokers;
    }

    public KafkaInputMapperConfiguration setBrokers(String brokers) {
        this.brokers = brokers;
        return this;
    }

    public OffsetConfiguration getOffset() {
        return offset;
    }

    public KafkaInputMapperConfiguration setOffset(OffsetConfiguration offset) {
        this.offset = offset;
        return this;
    }
}