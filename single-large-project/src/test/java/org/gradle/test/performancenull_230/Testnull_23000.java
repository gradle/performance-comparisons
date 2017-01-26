package org.gradle.test.performancenull_230;

import static org.junit.Assert.*;

public class Testnull_23000 {
    private final Productionnull_23000 production = new Productionnull_23000("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}