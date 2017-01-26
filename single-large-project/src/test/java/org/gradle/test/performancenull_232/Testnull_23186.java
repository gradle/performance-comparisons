package org.gradle.test.performancenull_232;

import static org.junit.Assert.*;

public class Testnull_23186 {
    private final Productionnull_23186 production = new Productionnull_23186("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}