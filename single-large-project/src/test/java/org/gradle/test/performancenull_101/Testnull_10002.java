package org.gradle.test.performancenull_101;

import static org.junit.Assert.*;

public class Testnull_10002 {
    private final Productionnull_10002 production = new Productionnull_10002("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}