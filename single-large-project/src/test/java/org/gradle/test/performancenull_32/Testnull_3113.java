package org.gradle.test.performancenull_32;

import static org.junit.Assert.*;

public class Testnull_3113 {
    private final Productionnull_3113 production = new Productionnull_3113("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}