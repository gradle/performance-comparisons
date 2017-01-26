package org.gradle.test.performancenull_54;

import static org.junit.Assert.*;

public class Testnull_5368 {
    private final Productionnull_5368 production = new Productionnull_5368("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}