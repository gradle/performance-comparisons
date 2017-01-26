package org.gradle.test.performancenull_80;

import static org.junit.Assert.*;

public class Testnull_7902 {
    private final Productionnull_7902 production = new Productionnull_7902("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}