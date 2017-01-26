package org.gradle.test.performancenull_232;

import static org.junit.Assert.*;

public class Testnull_23161 {
    private final Productionnull_23161 production = new Productionnull_23161("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}