package org.talend.component.beam.kafka.source;

import static org.junit.Assert.assertEquals;

import java.io.Serializable;

import javax.json.JsonObject;

import org.apache.beam.sdk.PipelineResult;
import org.apache.beam.sdk.testing.PAssert;
import org.apache.beam.sdk.testing.TestPipeline;
import org.apache.beam.sdk.values.PCollection;
import org.junit.ClassRule;
import org.junit.Ignore;
import org.junit.Rule;
import org.junit.Test;
import org.talend.sdk.component.junit.SimpleComponentRule;
import org.talend.sdk.component.runtime.beam.TalendIO;
import org.talend.sdk.component.runtime.input.Mapper;

public class CompanyComponent4MapperBeamTest implements Serializable {
    @ClassRule
    public static final SimpleComponentRule COMPONENT_FACTORY = new SimpleComponentRule("org.talend.component.beam.kafka");

    @Rule
    public transient final TestPipeline pipeline = TestPipeline.create();

    @Test
    @Ignore("You need to complete this test with your own data and assertions")
    public void produce() {
        // Setup your component configuration for the test here
        final CompanyComponent4MapperConfiguration configuration =  new CompanyComponent4MapperConfiguration();

        // We create the component mapper instance using the configuration filled above
        final Mapper mapper = COMPONENT_FACTORY.createMapper(CompanyComponent4Mapper.class, configuration);

        // create a pipeline starting with the mapper
        final PCollection<JsonObject> out = pipeline.apply(TalendIO.read(mapper));

        // then append some assertions to the output of the mapper,
        // PAssert is a beam utility to validate part of the pipeline
        PAssert.that(out).containsInAnyOrder(/* TODO - give the expected data */);

        // finally run the pipeline and ensure it was successful - i.e. data were validated
        assertEquals(PipelineResult.State.DONE, pipeline.run().waitUntilFinish());
    }
}