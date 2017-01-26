package org.gradle.test.performancenull_83;

import static org.junit.Assert.*;

public class Testnull_8241 {
    private final Productionnull_8241 production = new Productionnull_8241("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}