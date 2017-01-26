package org.gradle.test.performancenull_25;

import static org.junit.Assert.*;

public class Testnull_2463 {
    private final Productionnull_2463 production = new Productionnull_2463("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}