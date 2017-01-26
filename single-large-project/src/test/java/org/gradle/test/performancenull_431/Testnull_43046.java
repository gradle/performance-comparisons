package org.gradle.test.performancenull_431;

import static org.junit.Assert.*;

public class Testnull_43046 {
    private final Productionnull_43046 production = new Productionnull_43046("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}