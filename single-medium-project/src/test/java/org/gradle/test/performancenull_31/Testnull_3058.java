package org.gradle.test.performancenull_31;

import static org.junit.Assert.*;

public class Testnull_3058 {
    private final Productionnull_3058 production = new Productionnull_3058("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}