package org.gradle.test.performancenull_64;

import static org.junit.Assert.*;

public class Testnull_6391 {
    private final Productionnull_6391 production = new Productionnull_6391("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}