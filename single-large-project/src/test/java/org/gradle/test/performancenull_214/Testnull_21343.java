package org.gradle.test.performancenull_214;

import static org.junit.Assert.*;

public class Testnull_21343 {
    private final Productionnull_21343 production = new Productionnull_21343("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}