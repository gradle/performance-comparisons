package org.gradle.test.performancenull_214;

import static org.junit.Assert.*;

public class Testnull_21345 {
    private final Productionnull_21345 production = new Productionnull_21345("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}