package org.gradle.test.performancenull_500;

import static org.junit.Assert.*;

public class Testnull_49901 {
    private final Productionnull_49901 production = new Productionnull_49901("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}