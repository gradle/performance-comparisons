package org.gradle.test.performancenull_30;

import static org.junit.Assert.*;

public class Testnull_2982 {
    private final Productionnull_2982 production = new Productionnull_2982("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}