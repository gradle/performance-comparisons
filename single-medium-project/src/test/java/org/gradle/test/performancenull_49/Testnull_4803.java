package org.gradle.test.performancenull_49;

import static org.junit.Assert.*;

public class Testnull_4803 {
    private final Productionnull_4803 production = new Productionnull_4803("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}