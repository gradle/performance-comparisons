package org.gradle.test.performancenull_364;

import static org.junit.Assert.*;

public class Testnull_36397 {
    private final Productionnull_36397 production = new Productionnull_36397("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}