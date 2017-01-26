package org.gradle.test.performancenull_101;

import static org.junit.Assert.*;

public class Testnull_10086 {
    private final Productionnull_10086 production = new Productionnull_10086("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}