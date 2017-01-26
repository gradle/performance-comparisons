package org.gradle.test.performancenull_400;

import static org.junit.Assert.*;

public class Testnull_39982 {
    private final Productionnull_39982 production = new Productionnull_39982("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}