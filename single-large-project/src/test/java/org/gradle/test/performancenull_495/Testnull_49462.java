package org.gradle.test.performancenull_495;

import static org.junit.Assert.*;

public class Testnull_49462 {
    private final Productionnull_49462 production = new Productionnull_49462("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}