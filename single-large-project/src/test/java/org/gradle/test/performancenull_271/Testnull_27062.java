package org.gradle.test.performancenull_271;

import static org.junit.Assert.*;

public class Testnull_27062 {
    private final Productionnull_27062 production = new Productionnull_27062("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}