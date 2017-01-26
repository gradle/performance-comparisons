package org.gradle.test.performancenull_242;

import static org.junit.Assert.*;

public class Testnull_24146 {
    private final Productionnull_24146 production = new Productionnull_24146("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}