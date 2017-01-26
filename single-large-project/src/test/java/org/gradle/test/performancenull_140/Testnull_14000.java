package org.gradle.test.performancenull_140;

import static org.junit.Assert.*;

public class Testnull_14000 {
    private final Productionnull_14000 production = new Productionnull_14000("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}