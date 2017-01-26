package org.gradle.test.performancenull_180;

import static org.junit.Assert.*;

public class Testnull_17919 {
    private final Productionnull_17919 production = new Productionnull_17919("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}