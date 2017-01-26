package org.gradle.test.performancenull_106;

import static org.junit.Assert.*;

public class Testnull_10572 {
    private final Productionnull_10572 production = new Productionnull_10572("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}