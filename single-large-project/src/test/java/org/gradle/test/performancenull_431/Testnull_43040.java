package org.gradle.test.performancenull_431;

import static org.junit.Assert.*;

public class Testnull_43040 {
    private final Productionnull_43040 production = new Productionnull_43040("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}