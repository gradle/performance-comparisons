package org.gradle.test.performancenull_182;

import static org.junit.Assert.*;

public class Testnull_18150 {
    private final Productionnull_18150 production = new Productionnull_18150("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}