package org.gradle.test.performancenull_328;

import static org.junit.Assert.*;

public class Testnull_32705 {
    private final Productionnull_32705 production = new Productionnull_32705("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}