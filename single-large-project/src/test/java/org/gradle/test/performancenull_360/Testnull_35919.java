package org.gradle.test.performancenull_360;

import static org.junit.Assert.*;

public class Testnull_35919 {
    private final Productionnull_35919 production = new Productionnull_35919("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}