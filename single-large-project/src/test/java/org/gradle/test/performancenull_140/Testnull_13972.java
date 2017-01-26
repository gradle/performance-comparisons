package org.gradle.test.performancenull_140;

import static org.junit.Assert.*;

public class Testnull_13972 {
    private final Productionnull_13972 production = new Productionnull_13972("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}