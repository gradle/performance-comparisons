package org.gradle.test.performancenull_429;

import static org.junit.Assert.*;

public class Testnull_42823 {
    private final Productionnull_42823 production = new Productionnull_42823("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}