package org.gradle.test.performancenull_101;

import static org.junit.Assert.*;

public class Testnull_10075 {
    private final Productionnull_10075 production = new Productionnull_10075("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}