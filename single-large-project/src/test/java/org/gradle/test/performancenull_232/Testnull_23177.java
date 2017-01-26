package org.gradle.test.performancenull_232;

import static org.junit.Assert.*;

public class Testnull_23177 {
    private final Productionnull_23177 production = new Productionnull_23177("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}