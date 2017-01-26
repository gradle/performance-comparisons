package org.gradle.test.performancenull_431;

import static org.junit.Assert.*;

public class Testnull_43070 {
    private final Productionnull_43070 production = new Productionnull_43070("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}