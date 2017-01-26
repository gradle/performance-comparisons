package org.gradle.test.performancenull_86;

import static org.junit.Assert.*;

public class Testnull_8503 {
    private final Productionnull_8503 production = new Productionnull_8503("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}