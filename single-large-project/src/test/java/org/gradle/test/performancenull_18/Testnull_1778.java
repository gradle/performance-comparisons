package org.gradle.test.performancenull_18;

import static org.junit.Assert.*;

public class Testnull_1778 {
    private final Productionnull_1778 production = new Productionnull_1778("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}