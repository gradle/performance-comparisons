package org.gradle.test.performancenull_231;

import static org.junit.Assert.*;

public class Testnull_23054 {
    private final Productionnull_23054 production = new Productionnull_23054("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}