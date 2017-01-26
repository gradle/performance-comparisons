package org.gradle.test.performancenull_230;

import static org.junit.Assert.*;

public class Testnull_22982 {
    private final Productionnull_22982 production = new Productionnull_22982("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}