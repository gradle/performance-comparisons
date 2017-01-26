package org.gradle.test.performancenull_225;

import static org.junit.Assert.*;

public class Testnull_22409 {
    private final Productionnull_22409 production = new Productionnull_22409("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}