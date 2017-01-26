package org.gradle.test.performancenull_431;

import static org.junit.Assert.*;

public class Testnull_43065 {
    private final Productionnull_43065 production = new Productionnull_43065("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}