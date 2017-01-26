package org.gradle.test.performancenull_301;

import static org.junit.Assert.*;

public class Testnull_30080 {
    private final Productionnull_30080 production = new Productionnull_30080("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}