package org.gradle.test.performancenull_171;

import static org.junit.Assert.*;

public class Testnull_17069 {
    private final Productionnull_17069 production = new Productionnull_17069("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}