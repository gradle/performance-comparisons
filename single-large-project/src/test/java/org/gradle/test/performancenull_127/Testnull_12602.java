package org.gradle.test.performancenull_127;

import static org.junit.Assert.*;

public class Testnull_12602 {
    private final Productionnull_12602 production = new Productionnull_12602("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}