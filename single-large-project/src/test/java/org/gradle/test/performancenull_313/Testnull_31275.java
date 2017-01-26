package org.gradle.test.performancenull_313;

import static org.junit.Assert.*;

public class Testnull_31275 {
    private final Productionnull_31275 production = new Productionnull_31275("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}