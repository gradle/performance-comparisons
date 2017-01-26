package org.gradle.test.performancenull_70;

import static org.junit.Assert.*;

public class Testnull_6967 {
    private final Productionnull_6967 production = new Productionnull_6967("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}