package org.gradle.test.performancenull_53;

import static org.junit.Assert.*;

public class Testnull_5206 {
    private final Productionnull_5206 production = new Productionnull_5206("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}