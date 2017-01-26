package org.gradle.test.performancenull_373;

import static org.junit.Assert.*;

public class Testnull_37239 {
    private final Productionnull_37239 production = new Productionnull_37239("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}