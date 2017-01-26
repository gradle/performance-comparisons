package org.gradle.test.performancenull_213;

import static org.junit.Assert.*;

public class Testnull_21241 {
    private final Productionnull_21241 production = new Productionnull_21241("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}