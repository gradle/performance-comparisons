package org.gradle.test.performancenull_181;

import static org.junit.Assert.*;

public class Testnull_18067 {
    private final Productionnull_18067 production = new Productionnull_18067("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}