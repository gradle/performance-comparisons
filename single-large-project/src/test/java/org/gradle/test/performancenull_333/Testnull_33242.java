package org.gradle.test.performancenull_333;

import static org.junit.Assert.*;

public class Testnull_33242 {
    private final Productionnull_33242 production = new Productionnull_33242("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}