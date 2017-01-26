package org.gradle.test.performancenull_332;

import static org.junit.Assert.*;

public class Testnull_33199 {
    private final Productionnull_33199 production = new Productionnull_33199("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}