package org.gradle.test.performancenull_217;

import static org.junit.Assert.*;

public class Testnull_21620 {
    private final Productionnull_21620 production = new Productionnull_21620("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}