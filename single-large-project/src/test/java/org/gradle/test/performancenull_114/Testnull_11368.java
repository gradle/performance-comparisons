package org.gradle.test.performancenull_114;

import static org.junit.Assert.*;

public class Testnull_11368 {
    private final Productionnull_11368 production = new Productionnull_11368("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}