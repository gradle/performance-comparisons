package org.gradle.test.performancenull_230;

import static org.junit.Assert.*;

public class Testnull_22902 {
    private final Productionnull_22902 production = new Productionnull_22902("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}