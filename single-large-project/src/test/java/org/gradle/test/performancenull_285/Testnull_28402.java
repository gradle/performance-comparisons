package org.gradle.test.performancenull_285;

import static org.junit.Assert.*;

public class Testnull_28402 {
    private final Productionnull_28402 production = new Productionnull_28402("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}