package org.gradle.test.performancenull_192;

import static org.junit.Assert.*;

public class Testnull_19105 {
    private final Productionnull_19105 production = new Productionnull_19105("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}