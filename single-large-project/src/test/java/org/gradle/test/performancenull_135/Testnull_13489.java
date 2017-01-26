package org.gradle.test.performancenull_135;

import static org.junit.Assert.*;

public class Testnull_13489 {
    private final Productionnull_13489 production = new Productionnull_13489("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}