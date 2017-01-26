package org.gradle.test.performancenull_413;

import static org.junit.Assert.*;

public class Testnull_41269 {
    private final Productionnull_41269 production = new Productionnull_41269("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}