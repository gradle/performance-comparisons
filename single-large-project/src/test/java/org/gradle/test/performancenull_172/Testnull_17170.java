package org.gradle.test.performancenull_172;

import static org.junit.Assert.*;

public class Testnull_17170 {
    private final Productionnull_17170 production = new Productionnull_17170("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}