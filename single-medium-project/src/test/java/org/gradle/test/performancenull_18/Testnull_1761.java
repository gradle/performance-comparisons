package org.gradle.test.performancenull_18;

import static org.junit.Assert.*;

public class Testnull_1761 {
    private final Productionnull_1761 production = new Productionnull_1761("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}