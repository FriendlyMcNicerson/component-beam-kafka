package org.talend.component.beam.kafka.processor;

import java.io.Serializable;

import org.talend.sdk.component.api.configuration.Option;
import org.talend.sdk.component.api.configuration.ui.layout.GridLayout;
import org.talend.sdk.component.api.meta.Documentation;

@GridLayout({
    // the generated layout put one configuration entry per line,
    // customize it as much as needed
    @GridLayout.Row({ "avpath" })
})
@Documentation("TODO fill the documentation for this configuration")
public class FilterRowProcessorConfiguration implements Serializable {
    @Option
    @Documentation("TODO fill the documentation for this parameter")
    private String avpath;

    public String getAvpath() {
        return avpath;
    }

    public FilterRowProcessorConfiguration setAvpath(String avpath) {
        this.avpath = avpath;
        return this;
    }
}