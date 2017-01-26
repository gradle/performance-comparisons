package org.gradle.test.performancenull_251;

import static org.junit.Assert.*;

public class Testnull_25049 {
    private final Productionnull_25049 production = new Productionnull_25049("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}