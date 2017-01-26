package org.gradle.test.performancenull_18;

import static org.junit.Assert.*;

public class Testnull_1784 {
    private final Productionnull_1784 production = new Productionnull_1784("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}