package org.gradle.test.performancenull_356;

import static org.junit.Assert.*;

public class Testnull_35580 {
    private final Productionnull_35580 production = new Productionnull_35580("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}