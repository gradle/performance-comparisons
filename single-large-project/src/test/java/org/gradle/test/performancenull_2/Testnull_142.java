package org.gradle.test.performancenull_2;

import static org.junit.Assert.*;

public class Testnull_142 {
    private final Productionnull_142 production = new Productionnull_142("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}