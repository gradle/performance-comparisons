package org.gradle.test.performancenull_18;

import static org.junit.Assert.*;

public class Testnull_1786 {
    private final Productionnull_1786 production = new Productionnull_1786("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}