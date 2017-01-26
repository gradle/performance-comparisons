package org.gradle.test.performancenull_230;

import static org.junit.Assert.*;

public class Testnull_22973 {
    private final Productionnull_22973 production = new Productionnull_22973("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}