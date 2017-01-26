package org.gradle.test.performancenull_175;

import static org.junit.Assert.*;

public class Testnull_17479 {
    private final Productionnull_17479 production = new Productionnull_17479("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}