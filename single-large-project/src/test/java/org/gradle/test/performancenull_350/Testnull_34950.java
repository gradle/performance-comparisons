package org.gradle.test.performancenull_350;

import static org.junit.Assert.*;

public class Testnull_34950 {
    private final Productionnull_34950 production = new Productionnull_34950("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}