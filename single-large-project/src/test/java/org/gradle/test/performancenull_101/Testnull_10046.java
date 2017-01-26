package org.gradle.test.performancenull_101;

import static org.junit.Assert.*;

public class Testnull_10046 {
    private final Productionnull_10046 production = new Productionnull_10046("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}