package org.gradle.test.performancenull_423;

import static org.junit.Assert.*;

public class Testnull_42228 {
    private final Productionnull_42228 production = new Productionnull_42228("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}