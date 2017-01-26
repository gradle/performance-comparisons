package org.gradle.test.performancenull_386;

import static org.junit.Assert.*;

public class Testnull_38572 {
    private final Productionnull_38572 production = new Productionnull_38572("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}