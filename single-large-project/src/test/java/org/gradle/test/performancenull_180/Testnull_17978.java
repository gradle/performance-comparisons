package org.gradle.test.performancenull_180;

import static org.junit.Assert.*;

public class Testnull_17978 {
    private final Productionnull_17978 production = new Productionnull_17978("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}