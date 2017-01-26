package org.gradle.test.performancenull_422;

import static org.junit.Assert.*;

public class Testnull_42161 {
    private final Productionnull_42161 production = new Productionnull_42161("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}