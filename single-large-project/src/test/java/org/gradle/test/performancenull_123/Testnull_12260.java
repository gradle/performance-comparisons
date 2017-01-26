package org.gradle.test.performancenull_123;

import static org.junit.Assert.*;

public class Testnull_12260 {
    private final Productionnull_12260 production = new Productionnull_12260("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}