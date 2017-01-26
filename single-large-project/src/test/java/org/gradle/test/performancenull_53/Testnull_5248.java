package org.gradle.test.performancenull_53;

import static org.junit.Assert.*;

public class Testnull_5248 {
    private final Productionnull_5248 production = new Productionnull_5248("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}