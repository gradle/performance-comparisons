package org.gradle.test.performancenull_192;

import static org.junit.Assert.*;

public class Testnull_19160 {
    private final Productionnull_19160 production = new Productionnull_19160("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}