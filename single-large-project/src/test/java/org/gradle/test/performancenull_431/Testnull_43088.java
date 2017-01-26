package org.gradle.test.performancenull_431;

import static org.junit.Assert.*;

public class Testnull_43088 {
    private final Productionnull_43088 production = new Productionnull_43088("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}