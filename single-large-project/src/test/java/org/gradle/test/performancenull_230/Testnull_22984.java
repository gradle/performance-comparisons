package org.gradle.test.performancenull_230;

import static org.junit.Assert.*;

public class Testnull_22984 {
    private final Productionnull_22984 production = new Productionnull_22984("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}