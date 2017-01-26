package org.gradle.test.performancenull_182;

import static org.junit.Assert.*;

public class Testnull_18126 {
    private final Productionnull_18126 production = new Productionnull_18126("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}