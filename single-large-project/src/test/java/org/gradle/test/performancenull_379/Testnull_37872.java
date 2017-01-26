package org.gradle.test.performancenull_379;

import static org.junit.Assert.*;

public class Testnull_37872 {
    private final Productionnull_37872 production = new Productionnull_37872("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}