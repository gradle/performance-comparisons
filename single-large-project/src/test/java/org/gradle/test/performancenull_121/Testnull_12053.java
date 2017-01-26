package org.gradle.test.performancenull_121;

import static org.junit.Assert.*;

public class Testnull_12053 {
    private final Productionnull_12053 production = new Productionnull_12053("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}