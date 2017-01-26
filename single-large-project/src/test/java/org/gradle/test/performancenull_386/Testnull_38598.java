package org.gradle.test.performancenull_386;

import static org.junit.Assert.*;

public class Testnull_38598 {
    private final Productionnull_38598 production = new Productionnull_38598("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}