package org.gradle.test.performancenull_345;

import static org.junit.Assert.*;

public class Testnull_34428 {
    private final Productionnull_34428 production = new Productionnull_34428("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}