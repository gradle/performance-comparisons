package org.gradle.test.performancenull_130;

import static org.junit.Assert.*;

public class Testnull_12940 {
    private final Productionnull_12940 production = new Productionnull_12940("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}