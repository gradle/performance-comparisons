package org.gradle.test.performancenull_101;

import static org.junit.Assert.*;

public class Testnull_10084 {
    private final Productionnull_10084 production = new Productionnull_10084("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}