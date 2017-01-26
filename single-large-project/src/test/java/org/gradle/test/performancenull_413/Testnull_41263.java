package org.gradle.test.performancenull_413;

import static org.junit.Assert.*;

public class Testnull_41263 {
    private final Productionnull_41263 production = new Productionnull_41263("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}