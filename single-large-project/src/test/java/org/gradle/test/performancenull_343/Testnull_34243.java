package org.gradle.test.performancenull_343;

import static org.junit.Assert.*;

public class Testnull_34243 {
    private final Productionnull_34243 production = new Productionnull_34243("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}