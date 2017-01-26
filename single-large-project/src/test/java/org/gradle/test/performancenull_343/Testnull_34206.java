package org.gradle.test.performancenull_343;

import static org.junit.Assert.*;

public class Testnull_34206 {
    private final Productionnull_34206 production = new Productionnull_34206("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}