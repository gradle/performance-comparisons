package org.gradle.test.performancenull_121;

import static org.junit.Assert.*;

public class Testnull_12092 {
    private final Productionnull_12092 production = new Productionnull_12092("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}