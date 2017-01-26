package org.gradle.test.performancenull_172;

import static org.junit.Assert.*;

public class Testnull_17162 {
    private final Productionnull_17162 production = new Productionnull_17162("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}