package org.gradle.test.performancenull_215;

import static org.junit.Assert.*;

public class Testnull_21430 {
    private final Productionnull_21430 production = new Productionnull_21430("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}