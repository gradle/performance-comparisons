package org.gradle.test.performancenull_368;

import static org.junit.Assert.*;

public class Testnull_36738 {
    private final Productionnull_36738 production = new Productionnull_36738("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}