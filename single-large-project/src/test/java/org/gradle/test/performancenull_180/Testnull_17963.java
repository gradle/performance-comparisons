package org.gradle.test.performancenull_180;

import static org.junit.Assert.*;

public class Testnull_17963 {
    private final Productionnull_17963 production = new Productionnull_17963("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}