package org.gradle.test.performancenull_124;

import static org.junit.Assert.*;

public class Testnull_12338 {
    private final Productionnull_12338 production = new Productionnull_12338("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}