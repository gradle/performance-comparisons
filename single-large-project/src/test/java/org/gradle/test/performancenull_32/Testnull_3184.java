package org.gradle.test.performancenull_32;

import static org.junit.Assert.*;

public class Testnull_3184 {
    private final Productionnull_3184 production = new Productionnull_3184("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}