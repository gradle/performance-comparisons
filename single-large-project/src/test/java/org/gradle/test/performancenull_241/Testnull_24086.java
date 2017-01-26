package org.gradle.test.performancenull_241;

import static org.junit.Assert.*;

public class Testnull_24086 {
    private final Productionnull_24086 production = new Productionnull_24086("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}