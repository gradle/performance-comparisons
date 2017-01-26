package org.gradle.test.performancenull_242;

import static org.junit.Assert.*;

public class Testnull_24110 {
    private final Productionnull_24110 production = new Productionnull_24110("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}