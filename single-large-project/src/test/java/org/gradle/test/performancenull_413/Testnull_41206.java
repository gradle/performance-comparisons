package org.gradle.test.performancenull_413;

import static org.junit.Assert.*;

public class Testnull_41206 {
    private final Productionnull_41206 production = new Productionnull_41206("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}