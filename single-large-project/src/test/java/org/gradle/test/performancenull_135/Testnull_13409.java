package org.gradle.test.performancenull_135;

import static org.junit.Assert.*;

public class Testnull_13409 {
    private final Productionnull_13409 production = new Productionnull_13409("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}