package org.gradle.test.performancenull_180;

import static org.junit.Assert.*;

public class Testnull_17956 {
    private final Productionnull_17956 production = new Productionnull_17956("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}