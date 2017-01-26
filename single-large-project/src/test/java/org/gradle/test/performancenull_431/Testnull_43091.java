package org.gradle.test.performancenull_431;

import static org.junit.Assert.*;

public class Testnull_43091 {
    private final Productionnull_43091 production = new Productionnull_43091("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}