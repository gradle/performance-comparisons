package org.gradle.test.performancenull_212;

import static org.junit.Assert.*;

public class Testnull_21176 {
    private final Productionnull_21176 production = new Productionnull_21176("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}