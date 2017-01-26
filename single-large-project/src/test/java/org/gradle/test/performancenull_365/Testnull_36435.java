package org.gradle.test.performancenull_365;

import static org.junit.Assert.*;

public class Testnull_36435 {
    private final Productionnull_36435 production = new Productionnull_36435("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}