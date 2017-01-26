package org.gradle.test.performancenull_182;

import static org.junit.Assert.*;

public class Testnull_18160 {
    private final Productionnull_18160 production = new Productionnull_18160("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}