package org.gradle.test.performancenull_301;

import static org.junit.Assert.*;

public class Testnull_30029 {
    private final Productionnull_30029 production = new Productionnull_30029("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}