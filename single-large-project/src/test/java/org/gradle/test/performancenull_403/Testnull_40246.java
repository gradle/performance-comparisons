package org.gradle.test.performancenull_403;

import static org.junit.Assert.*;

public class Testnull_40246 {
    private final Productionnull_40246 production = new Productionnull_40246("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}