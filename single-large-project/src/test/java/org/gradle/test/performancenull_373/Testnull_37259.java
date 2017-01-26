package org.gradle.test.performancenull_373;

import static org.junit.Assert.*;

public class Testnull_37259 {
    private final Productionnull_37259 production = new Productionnull_37259("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}