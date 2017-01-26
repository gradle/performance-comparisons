package org.gradle.test.performancenull_253;

import static org.junit.Assert.*;

public class Testnull_25201 {
    private final Productionnull_25201 production = new Productionnull_25201("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}