package org.gradle.test.performancenull_19;

import static org.junit.Assert.*;

public class Testnull_1855 {
    private final Productionnull_1855 production = new Productionnull_1855("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}