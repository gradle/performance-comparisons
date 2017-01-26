package org.gradle.test.performancenull_18;

import static org.junit.Assert.*;

public class Testnull_1793 {
    private final Productionnull_1793 production = new Productionnull_1793("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}