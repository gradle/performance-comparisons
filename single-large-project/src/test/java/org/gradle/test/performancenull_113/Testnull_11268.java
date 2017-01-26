package org.gradle.test.performancenull_113;

import static org.junit.Assert.*;

public class Testnull_11268 {
    private final Productionnull_11268 production = new Productionnull_11268("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}