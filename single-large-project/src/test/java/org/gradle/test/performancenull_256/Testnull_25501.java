package org.gradle.test.performancenull_256;

import static org.junit.Assert.*;

public class Testnull_25501 {
    private final Productionnull_25501 production = new Productionnull_25501("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}