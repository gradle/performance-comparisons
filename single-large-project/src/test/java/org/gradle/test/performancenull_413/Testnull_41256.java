package org.gradle.test.performancenull_413;

import static org.junit.Assert.*;

public class Testnull_41256 {
    private final Productionnull_41256 production = new Productionnull_41256("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}