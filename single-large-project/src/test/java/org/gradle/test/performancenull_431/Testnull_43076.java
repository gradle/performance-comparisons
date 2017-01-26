package org.gradle.test.performancenull_431;

import static org.junit.Assert.*;

public class Testnull_43076 {
    private final Productionnull_43076 production = new Productionnull_43076("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}