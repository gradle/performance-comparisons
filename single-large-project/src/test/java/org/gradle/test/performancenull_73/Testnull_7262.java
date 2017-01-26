package org.gradle.test.performancenull_73;

import static org.junit.Assert.*;

public class Testnull_7262 {
    private final Productionnull_7262 production = new Productionnull_7262("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}