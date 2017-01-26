package org.gradle.test.performancenull_180;

import static org.junit.Assert.*;

public class Testnull_17932 {
    private final Productionnull_17932 production = new Productionnull_17932("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}