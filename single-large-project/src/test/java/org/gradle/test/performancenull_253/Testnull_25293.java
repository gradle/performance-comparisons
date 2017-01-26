package org.gradle.test.performancenull_253;

import static org.junit.Assert.*;

public class Testnull_25293 {
    private final Productionnull_25293 production = new Productionnull_25293("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}