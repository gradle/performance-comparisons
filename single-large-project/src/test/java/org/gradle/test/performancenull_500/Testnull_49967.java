package org.gradle.test.performancenull_500;

import static org.junit.Assert.*;

public class Testnull_49967 {
    private final Productionnull_49967 production = new Productionnull_49967("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}