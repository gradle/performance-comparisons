package org.gradle.test.performancenull_101;

import static org.junit.Assert.*;

public class Testnull_10005 {
    private final Productionnull_10005 production = new Productionnull_10005("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}