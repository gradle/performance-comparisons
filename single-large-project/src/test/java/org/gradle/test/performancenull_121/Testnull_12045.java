package org.gradle.test.performancenull_121;

import static org.junit.Assert.*;

public class Testnull_12045 {
    private final Productionnull_12045 production = new Productionnull_12045("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}