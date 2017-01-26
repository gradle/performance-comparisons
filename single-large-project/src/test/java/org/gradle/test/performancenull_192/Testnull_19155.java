package org.gradle.test.performancenull_192;

import static org.junit.Assert.*;

public class Testnull_19155 {
    private final Productionnull_19155 production = new Productionnull_19155("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}