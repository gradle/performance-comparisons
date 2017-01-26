package org.gradle.test.performancenull_225;

import static org.junit.Assert.*;

public class Testnull_22493 {
    private final Productionnull_22493 production = new Productionnull_22493("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}