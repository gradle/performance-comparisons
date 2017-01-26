package org.gradle.test.performancenull_220;

import static org.junit.Assert.*;

public class Testnull_21986 {
    private final Productionnull_21986 production = new Productionnull_21986("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}