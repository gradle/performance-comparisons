package org.gradle.test.performancenull_422;

import static org.junit.Assert.*;

public class Testnull_42118 {
    private final Productionnull_42118 production = new Productionnull_42118("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}