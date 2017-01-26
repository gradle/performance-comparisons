package org.gradle.test.performancenull_20;

import static org.junit.Assert.*;

public class Testnull_1962 {
    private final Productionnull_1962 production = new Productionnull_1962("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}