package org.gradle.test.performancenull_241;

import static org.junit.Assert.*;

public class Testnull_24070 {
    private final Productionnull_24070 production = new Productionnull_24070("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}