package org.gradle.test.performancenull_80;

import static org.junit.Assert.*;

public class Testnull_7941 {
    private final Productionnull_7941 production = new Productionnull_7941("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}