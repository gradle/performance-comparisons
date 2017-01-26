package org.gradle.test.performancenull_219;

import static org.junit.Assert.*;

public class Testnull_21820 {
    private final Productionnull_21820 production = new Productionnull_21820("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}