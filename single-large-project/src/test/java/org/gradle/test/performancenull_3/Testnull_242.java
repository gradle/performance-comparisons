package org.gradle.test.performancenull_3;

import static org.junit.Assert.*;

public class Testnull_242 {
    private final Productionnull_242 production = new Productionnull_242("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}