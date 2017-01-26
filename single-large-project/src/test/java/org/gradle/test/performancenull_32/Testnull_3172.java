package org.gradle.test.performancenull_32;

import static org.junit.Assert.*;

public class Testnull_3172 {
    private final Productionnull_3172 production = new Productionnull_3172("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}