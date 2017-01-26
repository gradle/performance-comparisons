package org.gradle.test.performancenull_5;

import static org.junit.Assert.*;

public class Testnull_462 {
    private final Productionnull_462 production = new Productionnull_462("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}