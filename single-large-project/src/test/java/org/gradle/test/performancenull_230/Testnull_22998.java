package org.gradle.test.performancenull_230;

import static org.junit.Assert.*;

public class Testnull_22998 {
    private final Productionnull_22998 production = new Productionnull_22998("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}