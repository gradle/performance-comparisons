package org.gradle.test.performancenull_360;

import static org.junit.Assert.*;

public class Testnull_35984 {
    private final Productionnull_35984 production = new Productionnull_35984("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}