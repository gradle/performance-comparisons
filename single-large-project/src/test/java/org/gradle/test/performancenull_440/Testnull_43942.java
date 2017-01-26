package org.gradle.test.performancenull_440;

import static org.junit.Assert.*;

public class Testnull_43942 {
    private final Productionnull_43942 production = new Productionnull_43942("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}