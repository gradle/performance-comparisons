package org.gradle.test.performancenull_216;

import static org.junit.Assert.*;

public class Testnull_21546 {
    private final Productionnull_21546 production = new Productionnull_21546("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}