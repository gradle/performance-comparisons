package org.gradle.test.performancenull_180;

import static org.junit.Assert.*;

public class Testnull_17930 {
    private final Productionnull_17930 production = new Productionnull_17930("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}