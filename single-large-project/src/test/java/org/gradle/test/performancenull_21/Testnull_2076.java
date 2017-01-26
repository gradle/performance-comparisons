package org.gradle.test.performancenull_21;

import static org.junit.Assert.*;

public class Testnull_2076 {
    private final Productionnull_2076 production = new Productionnull_2076("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}