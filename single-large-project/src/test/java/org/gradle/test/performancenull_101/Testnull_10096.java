package org.gradle.test.performancenull_101;

import static org.junit.Assert.*;

public class Testnull_10096 {
    private final Productionnull_10096 production = new Productionnull_10096("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}