package org.gradle.test.performancenull_413;

import static org.junit.Assert.*;

public class Testnull_41291 {
    private final Productionnull_41291 production = new Productionnull_41291("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}