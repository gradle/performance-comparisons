package org.gradle.test.performancenull_175;

import static org.junit.Assert.*;

public class Testnull_17427 {
    private final Productionnull_17427 production = new Productionnull_17427("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}