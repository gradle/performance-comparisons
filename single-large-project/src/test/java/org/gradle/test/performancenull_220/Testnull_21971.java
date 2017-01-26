package org.gradle.test.performancenull_220;

import static org.junit.Assert.*;

public class Testnull_21971 {
    private final Productionnull_21971 production = new Productionnull_21971("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}