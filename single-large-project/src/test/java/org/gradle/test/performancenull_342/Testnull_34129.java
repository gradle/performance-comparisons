package org.gradle.test.performancenull_342;

import static org.junit.Assert.*;

public class Testnull_34129 {
    private final Productionnull_34129 production = new Productionnull_34129("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}