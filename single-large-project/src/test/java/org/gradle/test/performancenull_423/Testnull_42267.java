package org.gradle.test.performancenull_423;

import static org.junit.Assert.*;

public class Testnull_42267 {
    private final Productionnull_42267 production = new Productionnull_42267("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}