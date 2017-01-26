package org.gradle.test.performancenull_251;

import static org.junit.Assert.*;

public class Testnull_25068 {
    private final Productionnull_25068 production = new Productionnull_25068("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}