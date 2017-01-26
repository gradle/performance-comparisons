package org.gradle.test.performancenull_283;

import static org.junit.Assert.*;

public class Testnull_28248 {
    private final Productionnull_28248 production = new Productionnull_28248("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}