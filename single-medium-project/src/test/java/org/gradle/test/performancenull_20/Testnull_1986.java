package org.gradle.test.performancenull_20;

import static org.junit.Assert.*;

public class Testnull_1986 {
    private final Productionnull_1986 production = new Productionnull_1986("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}