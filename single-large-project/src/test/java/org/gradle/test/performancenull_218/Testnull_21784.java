package org.gradle.test.performancenull_218;

import static org.junit.Assert.*;

public class Testnull_21784 {
    private final Productionnull_21784 production = new Productionnull_21784("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}