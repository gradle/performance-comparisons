package org.gradle.test.performancenull_421;

import static org.junit.Assert.*;

public class Testnull_42010 {
    private final Productionnull_42010 production = new Productionnull_42010("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}