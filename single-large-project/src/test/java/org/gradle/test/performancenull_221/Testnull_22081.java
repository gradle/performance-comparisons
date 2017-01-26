package org.gradle.test.performancenull_221;

import static org.junit.Assert.*;

public class Testnull_22081 {
    private final Productionnull_22081 production = new Productionnull_22081("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}