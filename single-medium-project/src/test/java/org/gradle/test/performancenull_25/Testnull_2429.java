package org.gradle.test.performancenull_25;

import static org.junit.Assert.*;

public class Testnull_2429 {
    private final Productionnull_2429 production = new Productionnull_2429("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}