package org.gradle.test.performancenull_488;

import static org.junit.Assert.*;

public class Testnull_48786 {
    private final Productionnull_48786 production = new Productionnull_48786("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}