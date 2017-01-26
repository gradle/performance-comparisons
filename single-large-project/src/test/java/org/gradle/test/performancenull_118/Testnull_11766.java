package org.gradle.test.performancenull_118;

import static org.junit.Assert.*;

public class Testnull_11766 {
    private final Productionnull_11766 production = new Productionnull_11766("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}