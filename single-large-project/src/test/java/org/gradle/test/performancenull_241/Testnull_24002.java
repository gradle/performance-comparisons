package org.gradle.test.performancenull_241;

import static org.junit.Assert.*;

public class Testnull_24002 {
    private final Productionnull_24002 production = new Productionnull_24002("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}