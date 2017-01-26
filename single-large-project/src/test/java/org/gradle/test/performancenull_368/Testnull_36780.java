package org.gradle.test.performancenull_368;

import static org.junit.Assert.*;

public class Testnull_36780 {
    private final Productionnull_36780 production = new Productionnull_36780("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}