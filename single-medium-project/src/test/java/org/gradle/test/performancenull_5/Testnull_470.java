package org.gradle.test.performancenull_5;

import static org.junit.Assert.*;

public class Testnull_470 {
    private final Productionnull_470 production = new Productionnull_470("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}