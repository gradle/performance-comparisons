package org.gradle.test.performancenull_132;

import static org.junit.Assert.*;

public class Testnull_13180 {
    private final Productionnull_13180 production = new Productionnull_13180("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}