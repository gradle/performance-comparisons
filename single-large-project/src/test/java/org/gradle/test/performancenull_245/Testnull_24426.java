package org.gradle.test.performancenull_245;

import static org.junit.Assert.*;

public class Testnull_24426 {
    private final Productionnull_24426 production = new Productionnull_24426("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}