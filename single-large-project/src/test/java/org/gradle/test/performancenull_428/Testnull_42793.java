package org.gradle.test.performancenull_428;

import static org.junit.Assert.*;

public class Testnull_42793 {
    private final Productionnull_42793 production = new Productionnull_42793("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}