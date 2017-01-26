package org.gradle.test.performancenull_356;

import static org.junit.Assert.*;

public class Testnull_35598 {
    private final Productionnull_35598 production = new Productionnull_35598("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}