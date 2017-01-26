package org.gradle.test.performancenull_242;

import static org.junit.Assert.*;

public class Testnull_24162 {
    private final Productionnull_24162 production = new Productionnull_24162("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}