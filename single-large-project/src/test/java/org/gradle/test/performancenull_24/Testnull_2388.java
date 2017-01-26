package org.gradle.test.performancenull_24;

import static org.junit.Assert.*;

public class Testnull_2388 {
    private final Productionnull_2388 production = new Productionnull_2388("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}