package org.gradle.test.performancenull_440;

import static org.junit.Assert.*;

public class Testnull_43982 {
    private final Productionnull_43982 production = new Productionnull_43982("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}