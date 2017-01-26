package org.gradle.test.performancenull_431;

import static org.junit.Assert.*;

public class Testnull_43075 {
    private final Productionnull_43075 production = new Productionnull_43075("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}