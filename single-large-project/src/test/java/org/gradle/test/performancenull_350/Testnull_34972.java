package org.gradle.test.performancenull_350;

import static org.junit.Assert.*;

public class Testnull_34972 {
    private final Productionnull_34972 production = new Productionnull_34972("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}