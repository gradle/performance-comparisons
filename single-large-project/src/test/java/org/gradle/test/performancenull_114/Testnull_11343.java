package org.gradle.test.performancenull_114;

import static org.junit.Assert.*;

public class Testnull_11343 {
    private final Productionnull_11343 production = new Productionnull_11343("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}