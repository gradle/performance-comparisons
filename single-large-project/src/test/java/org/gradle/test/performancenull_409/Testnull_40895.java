package org.gradle.test.performancenull_409;

import static org.junit.Assert.*;

public class Testnull_40895 {
    private final Productionnull_40895 production = new Productionnull_40895("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}