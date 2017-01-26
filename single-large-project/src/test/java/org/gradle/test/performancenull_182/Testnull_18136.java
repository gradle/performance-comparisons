package org.gradle.test.performancenull_182;

import static org.junit.Assert.*;

public class Testnull_18136 {
    private final Productionnull_18136 production = new Productionnull_18136("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}