package org.gradle.test.performancenull_101;

import static org.junit.Assert.*;

public class Testnull_10099 {
    private final Productionnull_10099 production = new Productionnull_10099("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}