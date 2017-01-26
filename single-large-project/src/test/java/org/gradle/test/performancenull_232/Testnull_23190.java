package org.gradle.test.performancenull_232;

import static org.junit.Assert.*;

public class Testnull_23190 {
    private final Productionnull_23190 production = new Productionnull_23190("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}