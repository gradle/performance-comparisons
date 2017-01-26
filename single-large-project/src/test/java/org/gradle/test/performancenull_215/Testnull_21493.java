package org.gradle.test.performancenull_215;

import static org.junit.Assert.*;

public class Testnull_21493 {
    private final Productionnull_21493 production = new Productionnull_21493("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}