package org.gradle.test.performancenull_234;

import static org.junit.Assert.*;

public class Testnull_23363 {
    private final Productionnull_23363 production = new Productionnull_23363("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}