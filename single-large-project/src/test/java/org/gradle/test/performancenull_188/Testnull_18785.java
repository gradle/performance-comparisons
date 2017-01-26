package org.gradle.test.performancenull_188;

import static org.junit.Assert.*;

public class Testnull_18785 {
    private final Productionnull_18785 production = new Productionnull_18785("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}