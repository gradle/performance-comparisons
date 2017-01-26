package org.gradle.test.performancenull_343;

import static org.junit.Assert.*;

public class Testnull_34215 {
    private final Productionnull_34215 production = new Productionnull_34215("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}