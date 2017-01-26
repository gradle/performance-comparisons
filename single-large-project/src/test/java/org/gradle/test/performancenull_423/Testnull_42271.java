package org.gradle.test.performancenull_423;

import static org.junit.Assert.*;

public class Testnull_42271 {
    private final Productionnull_42271 production = new Productionnull_42271("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}