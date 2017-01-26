package org.gradle.test.performancenull_421;

import static org.junit.Assert.*;

public class Testnull_42051 {
    private final Productionnull_42051 production = new Productionnull_42051("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}