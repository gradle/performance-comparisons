package org.gradle.test.performancenull_180;

import static org.junit.Assert.*;

public class Testnull_17994 {
    private final Productionnull_17994 production = new Productionnull_17994("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}