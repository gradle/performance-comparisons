package org.gradle.test.performancenull_8;

import static org.junit.Assert.*;

public class Testnull_792 {
    private final Productionnull_792 production = new Productionnull_792("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}