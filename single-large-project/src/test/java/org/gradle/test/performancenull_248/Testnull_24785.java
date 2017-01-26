package org.gradle.test.performancenull_248;

import static org.junit.Assert.*;

public class Testnull_24785 {
    private final Productionnull_24785 production = new Productionnull_24785("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}