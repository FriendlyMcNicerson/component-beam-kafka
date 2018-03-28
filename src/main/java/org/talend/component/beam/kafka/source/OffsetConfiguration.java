package org.talend.component.beam.kafka.source;

import java.io.Serializable;

import org.talend.sdk.component.api.configuration.Option;
import org.talend.sdk.component.api.configuration.ui.layout.GridLayout;
import org.talend.sdk.component.api.meta.Documentation;

@GridLayout({
    // the generated layout put one configuration entry per line,
    // customize it as much as needed
    @GridLayout.Row({ "configuration1" }),
    @GridLayout.Row({ "configuration2" })
})
@Documentation("TODO fill the documentation for this configuration")
public class OffsetConfiguration implements Serializable {
    @Option
    @Documentation("TODO fill the documentation for this parameter")
    private String configuration1;

    @Option
    @Documentation("TODO fill the documentation for this parameter")
    private String configuration2;

    public String getConfiguration1() {
        return configuration1;
    }

    public OffsetConfiguration setConfiguration1(String configuration1) {
        this.configuration1 = configuration1;
        return this;
    }

    public String getConfiguration2() {
        return configuration2;
    }

    public OffsetConfiguration setConfiguration2(String configuration2) {
        this.configuration2 = configuration2;
        return this;
    }
}