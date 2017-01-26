package org.gradle.test.performancenull_75;

import static org.junit.Assert.*;

public class Testnull_7483 {
    private final Productionnull_7483 production = new Productionnull_7483("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}