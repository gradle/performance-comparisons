package org.gradle.test.performancenull_181;

import static org.junit.Assert.*;

public class Testnull_18044 {
    private final Productionnull_18044 production = new Productionnull_18044("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}