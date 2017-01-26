package org.gradle.test.performancenull_454;

import static org.junit.Assert.*;

public class Testnull_45340 {
    private final Productionnull_45340 production = new Productionnull_45340("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}