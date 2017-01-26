package org.gradle.test.performancenull_240;

import static org.junit.Assert.*;

public class Testnull_23958 {
    private final Productionnull_23958 production = new Productionnull_23958("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}