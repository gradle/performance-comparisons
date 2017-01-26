package org.gradle.test.performancenull_101;

import static org.junit.Assert.*;

public class Testnull_10032 {
    private final Productionnull_10032 production = new Productionnull_10032("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}