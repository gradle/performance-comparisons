package org.gradle.test.performancenull_150;

import static org.junit.Assert.*;

public class Testnull_14987 {
    private final Productionnull_14987 production = new Productionnull_14987("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}