package org.gradle.test.performancenull_363;

import static org.junit.Assert.*;

public class Testnull_36201 {
    private final Productionnull_36201 production = new Productionnull_36201("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}