package org.gradle.test.performancenull_242;

import static org.junit.Assert.*;

public class Testnull_24182 {
    private final Productionnull_24182 production = new Productionnull_24182("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}