package org.gradle.test.performancenull_188;

import static org.junit.Assert.*;

public class Testnull_18705 {
    private final Productionnull_18705 production = new Productionnull_18705("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}