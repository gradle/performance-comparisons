package org.gradle.test.performancenull_365;

import static org.junit.Assert.*;

public class Testnull_36500 {
    private final Productionnull_36500 production = new Productionnull_36500("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}