package org.gradle.test.performancenull_249;

import static org.junit.Assert.*;

public class Testnull_24820 {
    private final Productionnull_24820 production = new Productionnull_24820("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}