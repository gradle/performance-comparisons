package org.gradle.test.performancenull_423;

import static org.junit.Assert.*;

public class Testnull_42263 {
    private final Productionnull_42263 production = new Productionnull_42263("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}