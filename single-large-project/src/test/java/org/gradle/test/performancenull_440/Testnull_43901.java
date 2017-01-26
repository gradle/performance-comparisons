package org.gradle.test.performancenull_440;

import static org.junit.Assert.*;

public class Testnull_43901 {
    private final Productionnull_43901 production = new Productionnull_43901("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}