package org.gradle.test.performancenull_54;

import static org.junit.Assert.*;

public class Testnull_5354 {
    private final Productionnull_5354 production = new Productionnull_5354("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}