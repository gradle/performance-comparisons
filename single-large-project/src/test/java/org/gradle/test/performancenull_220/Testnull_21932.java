package org.gradle.test.performancenull_220;

import static org.junit.Assert.*;

public class Testnull_21932 {
    private final Productionnull_21932 production = new Productionnull_21932("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}