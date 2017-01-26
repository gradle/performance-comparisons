package org.gradle.test.performancenull_73;

import static org.junit.Assert.*;

public class Testnull_7270 {
    private final Productionnull_7270 production = new Productionnull_7270("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}