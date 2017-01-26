package org.gradle.test.performancenull_83;

import static org.junit.Assert.*;

public class Testnull_8259 {
    private final Productionnull_8259 production = new Productionnull_8259("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}