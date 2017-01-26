package org.gradle.test.performancenull_423;

import static org.junit.Assert.*;

public class Testnull_42248 {
    private final Productionnull_42248 production = new Productionnull_42248("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}