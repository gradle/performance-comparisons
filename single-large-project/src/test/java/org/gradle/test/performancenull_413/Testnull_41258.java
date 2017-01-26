package org.gradle.test.performancenull_413;

import static org.junit.Assert.*;

public class Testnull_41258 {
    private final Productionnull_41258 production = new Productionnull_41258("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}