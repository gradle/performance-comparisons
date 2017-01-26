package org.gradle.test.performancenull_230;

import static org.junit.Assert.*;

public class Testnull_22985 {
    private final Productionnull_22985 production = new Productionnull_22985("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}