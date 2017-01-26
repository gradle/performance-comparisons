package org.gradle.test.performancenull_431;

import static org.junit.Assert.*;

public class Testnull_43090 {
    private final Productionnull_43090 production = new Productionnull_43090("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}