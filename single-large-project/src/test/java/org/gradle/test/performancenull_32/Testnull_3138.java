package org.gradle.test.performancenull_32;

import static org.junit.Assert.*;

public class Testnull_3138 {
    private final Productionnull_3138 production = new Productionnull_3138("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}