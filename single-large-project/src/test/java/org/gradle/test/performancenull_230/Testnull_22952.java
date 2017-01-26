package org.gradle.test.performancenull_230;

import static org.junit.Assert.*;

public class Testnull_22952 {
    private final Productionnull_22952 production = new Productionnull_22952("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}