package org.gradle.test.performancenull_21;

import static org.junit.Assert.*;

public class Testnull_2058 {
    private final Productionnull_2058 production = new Productionnull_2058("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}