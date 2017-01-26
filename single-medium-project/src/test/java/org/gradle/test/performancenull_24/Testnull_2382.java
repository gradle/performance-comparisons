package org.gradle.test.performancenull_24;

import static org.junit.Assert.*;

public class Testnull_2382 {
    private final Productionnull_2382 production = new Productionnull_2382("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}