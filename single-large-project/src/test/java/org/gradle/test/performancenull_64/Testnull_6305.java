package org.gradle.test.performancenull_64;

import static org.junit.Assert.*;

public class Testnull_6305 {
    private final Productionnull_6305 production = new Productionnull_6305("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}