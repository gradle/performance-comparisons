package org.gradle.test.performancenull_431;

import static org.junit.Assert.*;

public class Testnull_43035 {
    private final Productionnull_43035 production = new Productionnull_43035("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}