package org.gradle.test.performancenull_50;

import static org.junit.Assert.*;

public class Testnull_4982 {
    private final Productionnull_4982 production = new Productionnull_4982("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}