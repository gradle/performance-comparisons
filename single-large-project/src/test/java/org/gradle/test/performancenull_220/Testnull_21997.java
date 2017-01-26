package org.gradle.test.performancenull_220;

import static org.junit.Assert.*;

public class Testnull_21997 {
    private final Productionnull_21997 production = new Productionnull_21997("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}