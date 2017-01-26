package org.gradle.test.performancenull_33;

import static org.junit.Assert.*;

public class Testnull_3242 {
    private final Productionnull_3242 production = new Productionnull_3242("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}