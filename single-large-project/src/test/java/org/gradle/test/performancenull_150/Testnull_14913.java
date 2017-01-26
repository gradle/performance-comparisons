package org.gradle.test.performancenull_150;

import static org.junit.Assert.*;

public class Testnull_14913 {
    private final Productionnull_14913 production = new Productionnull_14913("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}