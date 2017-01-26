package org.gradle.test.performancenull_440;

import static org.junit.Assert.*;

public class Testnull_43968 {
    private final Productionnull_43968 production = new Productionnull_43968("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}