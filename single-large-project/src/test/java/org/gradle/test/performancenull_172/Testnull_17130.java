package org.gradle.test.performancenull_172;

import static org.junit.Assert.*;

public class Testnull_17130 {
    private final Productionnull_17130 production = new Productionnull_17130("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}