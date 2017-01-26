package org.gradle.test.performancenull_51;

import static org.junit.Assert.*;

public class Testnull_5002 {
    private final Productionnull_5002 production = new Productionnull_5002("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}