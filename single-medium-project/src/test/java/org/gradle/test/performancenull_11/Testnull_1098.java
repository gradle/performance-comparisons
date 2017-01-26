package org.gradle.test.performancenull_11;

import static org.junit.Assert.*;

public class Testnull_1098 {
    private final Productionnull_1098 production = new Productionnull_1098("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}