package org.gradle.test.performancenull_235;

import static org.junit.Assert.*;

public class Testnull_23419 {
    private final Productionnull_23419 production = new Productionnull_23419("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}