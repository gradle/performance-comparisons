package org.gradle.test.performancenull_101;

import static org.junit.Assert.*;

public class Testnull_10057 {
    private final Productionnull_10057 production = new Productionnull_10057("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}