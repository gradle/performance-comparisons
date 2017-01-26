package org.gradle.test.performancenull_220;

import static org.junit.Assert.*;

public class Testnull_21927 {
    private final Productionnull_21927 production = new Productionnull_21927("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}