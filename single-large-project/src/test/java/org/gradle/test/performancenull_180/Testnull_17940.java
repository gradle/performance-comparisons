package org.gradle.test.performancenull_180;

import static org.junit.Assert.*;

public class Testnull_17940 {
    private final Productionnull_17940 production = new Productionnull_17940("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}