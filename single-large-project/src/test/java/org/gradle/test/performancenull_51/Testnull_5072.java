package org.gradle.test.performancenull_51;

import static org.junit.Assert.*;

public class Testnull_5072 {
    private final Productionnull_5072 production = new Productionnull_5072("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}