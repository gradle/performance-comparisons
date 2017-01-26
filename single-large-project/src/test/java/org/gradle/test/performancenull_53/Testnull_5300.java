package org.gradle.test.performancenull_53;

import static org.junit.Assert.*;

public class Testnull_5300 {
    private final Productionnull_5300 production = new Productionnull_5300("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}