package org.gradle.test.performancenull_232;

import static org.junit.Assert.*;

public class Testnull_23138 {
    private final Productionnull_23138 production = new Productionnull_23138("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}