package org.gradle.test.performancenull_219;

import static org.junit.Assert.*;

public class Testnull_21874 {
    private final Productionnull_21874 production = new Productionnull_21874("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}