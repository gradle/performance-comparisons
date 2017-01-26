package org.gradle.test.performancenull_169;

import static org.junit.Assert.*;

public class Testnull_16876 {
    private final Productionnull_16876 production = new Productionnull_16876("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}