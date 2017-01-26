package org.gradle.test.performancenull_35;

import static org.junit.Assert.*;

public class Testnull_3463 {
    private final Productionnull_3463 production = new Productionnull_3463("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}