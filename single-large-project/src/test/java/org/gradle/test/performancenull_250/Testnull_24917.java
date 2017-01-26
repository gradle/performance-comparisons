package org.gradle.test.performancenull_250;

import static org.junit.Assert.*;

public class Testnull_24917 {
    private final Productionnull_24917 production = new Productionnull_24917("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}