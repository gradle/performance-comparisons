package org.gradle.test.performancenull_485;

import static org.junit.Assert.*;

public class Testnull_48405 {
    private final Productionnull_48405 production = new Productionnull_48405("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}