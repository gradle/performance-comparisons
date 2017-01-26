package org.gradle.test.performancenull_175;

import static org.junit.Assert.*;

public class Testnull_17416 {
    private final Productionnull_17416 production = new Productionnull_17416("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}