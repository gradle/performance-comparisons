package org.gradle.test.performancenull_406;

import static org.junit.Assert.*;

public class Testnull_40549 {
    private final Productionnull_40549 production = new Productionnull_40549("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}