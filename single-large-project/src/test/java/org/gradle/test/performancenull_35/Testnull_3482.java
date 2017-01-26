package org.gradle.test.performancenull_35;

import static org.junit.Assert.*;

public class Testnull_3482 {
    private final Productionnull_3482 production = new Productionnull_3482("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}