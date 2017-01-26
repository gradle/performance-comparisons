package org.gradle.test.performancenull_241;

import static org.junit.Assert.*;

public class Testnull_24073 {
    private final Productionnull_24073 production = new Productionnull_24073("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}