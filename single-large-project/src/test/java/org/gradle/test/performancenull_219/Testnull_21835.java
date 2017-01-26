package org.gradle.test.performancenull_219;

import static org.junit.Assert.*;

public class Testnull_21835 {
    private final Productionnull_21835 production = new Productionnull_21835("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}