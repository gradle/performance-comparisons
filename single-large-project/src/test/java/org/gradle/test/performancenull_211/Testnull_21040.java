package org.gradle.test.performancenull_211;

import static org.junit.Assert.*;

public class Testnull_21040 {
    private final Productionnull_21040 production = new Productionnull_21040("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}