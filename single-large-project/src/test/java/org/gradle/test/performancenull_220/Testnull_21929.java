package org.gradle.test.performancenull_220;

import static org.junit.Assert.*;

public class Testnull_21929 {
    private final Productionnull_21929 production = new Productionnull_21929("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}