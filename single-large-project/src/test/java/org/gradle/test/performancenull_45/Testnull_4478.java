package org.gradle.test.performancenull_45;

import static org.junit.Assert.*;

public class Testnull_4478 {
    private final Productionnull_4478 production = new Productionnull_4478("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}