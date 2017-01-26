package org.gradle.test.performancenull_423;

import static org.junit.Assert.*;

public class Testnull_42250 {
    private final Productionnull_42250 production = new Productionnull_42250("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}