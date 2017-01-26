package org.gradle.test.performancenull_73;

import static org.junit.Assert.*;

public class Testnull_7283 {
    private final Productionnull_7283 production = new Productionnull_7283("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}