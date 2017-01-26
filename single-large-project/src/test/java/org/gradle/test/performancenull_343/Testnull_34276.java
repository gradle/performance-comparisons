package org.gradle.test.performancenull_343;

import static org.junit.Assert.*;

public class Testnull_34276 {
    private final Productionnull_34276 production = new Productionnull_34276("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}