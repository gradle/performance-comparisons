package org.gradle.test.performancenull_386;

import static org.junit.Assert.*;

public class Testnull_38600 {
    private final Productionnull_38600 production = new Productionnull_38600("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}