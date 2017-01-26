package org.gradle.test.performancenull_101;

import static org.junit.Assert.*;

public class Testnull_10008 {
    private final Productionnull_10008 production = new Productionnull_10008("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}