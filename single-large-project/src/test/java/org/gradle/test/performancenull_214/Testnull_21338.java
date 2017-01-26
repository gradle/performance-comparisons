package org.gradle.test.performancenull_214;

import static org.junit.Assert.*;

public class Testnull_21338 {
    private final Productionnull_21338 production = new Productionnull_21338("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}