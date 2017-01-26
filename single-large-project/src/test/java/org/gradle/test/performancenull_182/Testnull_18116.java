package org.gradle.test.performancenull_182;

import static org.junit.Assert.*;

public class Testnull_18116 {
    private final Productionnull_18116 production = new Productionnull_18116("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}