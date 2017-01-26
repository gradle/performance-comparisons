package org.gradle.test.performancenull_222;

import static org.junit.Assert.*;

public class Testnull_22173 {
    private final Productionnull_22173 production = new Productionnull_22173("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}