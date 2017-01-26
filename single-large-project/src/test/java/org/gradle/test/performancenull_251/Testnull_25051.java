package org.gradle.test.performancenull_251;

import static org.junit.Assert.*;

public class Testnull_25051 {
    private final Productionnull_25051 production = new Productionnull_25051("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}