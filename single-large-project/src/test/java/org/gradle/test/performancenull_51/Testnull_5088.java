package org.gradle.test.performancenull_51;

import static org.junit.Assert.*;

public class Testnull_5088 {
    private final Productionnull_5088 production = new Productionnull_5088("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}