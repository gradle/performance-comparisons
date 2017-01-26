package org.gradle.test.performancenull_32;

import static org.junit.Assert.*;

public class Testnull_3130 {
    private final Productionnull_3130 production = new Productionnull_3130("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}