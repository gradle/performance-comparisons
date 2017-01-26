package org.gradle.test.performancenull_232;

import static org.junit.Assert.*;

public class Testnull_23183 {
    private final Productionnull_23183 production = new Productionnull_23183("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}