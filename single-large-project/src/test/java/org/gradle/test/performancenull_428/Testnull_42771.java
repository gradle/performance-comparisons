package org.gradle.test.performancenull_428;

import static org.junit.Assert.*;

public class Testnull_42771 {
    private final Productionnull_42771 production = new Productionnull_42771("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}