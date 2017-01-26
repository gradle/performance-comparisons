package org.gradle.test.performancenull_182;

import static org.junit.Assert.*;

public class Testnull_18199 {
    private final Productionnull_18199 production = new Productionnull_18199("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}