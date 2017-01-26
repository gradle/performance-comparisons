package org.gradle.test.performancenull_413;

import static org.junit.Assert.*;

public class Testnull_41276 {
    private final Productionnull_41276 production = new Productionnull_41276("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}