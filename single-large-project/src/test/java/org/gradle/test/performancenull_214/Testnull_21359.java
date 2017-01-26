package org.gradle.test.performancenull_214;

import static org.junit.Assert.*;

public class Testnull_21359 {
    private final Productionnull_21359 production = new Productionnull_21359("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}