package org.gradle.test.performancenull_368;

import static org.junit.Assert.*;

public class Testnull_36778 {
    private final Productionnull_36778 production = new Productionnull_36778("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}