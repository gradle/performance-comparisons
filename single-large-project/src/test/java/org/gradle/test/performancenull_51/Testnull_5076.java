package org.gradle.test.performancenull_51;

import static org.junit.Assert.*;

public class Testnull_5076 {
    private final Productionnull_5076 production = new Productionnull_5076("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}