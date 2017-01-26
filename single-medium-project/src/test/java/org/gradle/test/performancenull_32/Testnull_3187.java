package org.gradle.test.performancenull_32;

import static org.junit.Assert.*;

public class Testnull_3187 {
    private final Productionnull_3187 production = new Productionnull_3187("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}