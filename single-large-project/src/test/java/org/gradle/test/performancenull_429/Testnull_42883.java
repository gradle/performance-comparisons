package org.gradle.test.performancenull_429;

import static org.junit.Assert.*;

public class Testnull_42883 {
    private final Productionnull_42883 production = new Productionnull_42883("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}