package org.gradle.test.performancenull_213;

import static org.junit.Assert.*;

public class Testnull_21246 {
    private final Productionnull_21246 production = new Productionnull_21246("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}