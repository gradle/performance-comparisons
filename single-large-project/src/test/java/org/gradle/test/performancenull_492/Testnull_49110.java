package org.gradle.test.performancenull_492;

import static org.junit.Assert.*;

public class Testnull_49110 {
    private final Productionnull_49110 production = new Productionnull_49110("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}