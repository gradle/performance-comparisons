package org.gradle.test.performancenull_215;

import static org.junit.Assert.*;

public class Testnull_21499 {
    private final Productionnull_21499 production = new Productionnull_21499("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}