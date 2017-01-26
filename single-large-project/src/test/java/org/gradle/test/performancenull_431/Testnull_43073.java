package org.gradle.test.performancenull_431;

import static org.junit.Assert.*;

public class Testnull_43073 {
    private final Productionnull_43073 production = new Productionnull_43073("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}