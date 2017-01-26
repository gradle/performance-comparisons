package org.gradle.test.performancenull_219;

import static org.junit.Assert.*;

public class Testnull_21801 {
    private final Productionnull_21801 production = new Productionnull_21801("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}