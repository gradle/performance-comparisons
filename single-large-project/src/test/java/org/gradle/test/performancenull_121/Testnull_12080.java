package org.gradle.test.performancenull_121;

import static org.junit.Assert.*;

public class Testnull_12080 {
    private final Productionnull_12080 production = new Productionnull_12080("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}