package org.gradle.test.performancenull_342;

import static org.junit.Assert.*;

public class Testnull_34130 {
    private final Productionnull_34130 production = new Productionnull_34130("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}