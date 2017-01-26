package org.gradle.test.performancenull_213;

import static org.junit.Assert.*;

public class Testnull_21209 {
    private final Productionnull_21209 production = new Productionnull_21209("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}