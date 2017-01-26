package org.gradle.test.performancenull_211;

import static org.junit.Assert.*;

public class Testnull_21082 {
    private final Productionnull_21082 production = new Productionnull_21082("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}