package org.gradle.test.performancenull_225;

import static org.junit.Assert.*;

public class Testnull_22460 {
    private final Productionnull_22460 production = new Productionnull_22460("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}