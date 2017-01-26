package org.gradle.test.performancenull_491;

import static org.junit.Assert.*;

public class Testnull_49081 {
    private final Productionnull_49081 production = new Productionnull_49081("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}