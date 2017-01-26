package org.gradle.test.performancenull_21;

import static org.junit.Assert.*;

public class Testnull_2071 {
    private final Productionnull_2071 production = new Productionnull_2071("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}