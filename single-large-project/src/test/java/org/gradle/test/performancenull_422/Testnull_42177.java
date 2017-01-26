package org.gradle.test.performancenull_422;

import static org.junit.Assert.*;

public class Testnull_42177 {
    private final Productionnull_42177 production = new Productionnull_42177("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}