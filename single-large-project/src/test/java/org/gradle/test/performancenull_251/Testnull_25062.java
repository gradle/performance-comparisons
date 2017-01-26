package org.gradle.test.performancenull_251;

import static org.junit.Assert.*;

public class Testnull_25062 {
    private final Productionnull_25062 production = new Productionnull_25062("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}