package org.gradle.test.performancenull_205;

import static org.junit.Assert.*;

public class Testnull_20445 {
    private final Productionnull_20445 production = new Productionnull_20445("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}