package org.gradle.test.performancenull_315;

import static org.junit.Assert.*;

public class Testnull_31427 {
    private final Productionnull_31427 production = new Productionnull_31427("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}