package org.gradle.test.performancenull_49;

import static org.junit.Assert.*;

public class Testnull_4804 {
    private final Productionnull_4804 production = new Productionnull_4804("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}