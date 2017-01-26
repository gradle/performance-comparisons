package org.gradle.test.performancenull_251;

import static org.junit.Assert.*;

public class Testnull_25090 {
    private final Productionnull_25090 production = new Productionnull_25090("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}