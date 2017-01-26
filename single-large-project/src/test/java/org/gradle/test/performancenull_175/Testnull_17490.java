package org.gradle.test.performancenull_175;

import static org.junit.Assert.*;

public class Testnull_17490 {
    private final Productionnull_17490 production = new Productionnull_17490("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}