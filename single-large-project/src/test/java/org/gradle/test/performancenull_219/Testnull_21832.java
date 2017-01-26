package org.gradle.test.performancenull_219;

import static org.junit.Assert.*;

public class Testnull_21832 {
    private final Productionnull_21832 production = new Productionnull_21832("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}