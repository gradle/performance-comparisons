package org.gradle.test.performancenull_462;

import static org.junit.Assert.*;

public class Testnull_46101 {
    private final Productionnull_46101 production = new Productionnull_46101("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}