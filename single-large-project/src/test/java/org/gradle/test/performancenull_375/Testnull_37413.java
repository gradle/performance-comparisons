package org.gradle.test.performancenull_375;

import static org.junit.Assert.*;

public class Testnull_37413 {
    private final Productionnull_37413 production = new Productionnull_37413("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}