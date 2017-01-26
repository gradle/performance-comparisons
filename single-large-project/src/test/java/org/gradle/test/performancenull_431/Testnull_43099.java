package org.gradle.test.performancenull_431;

import static org.junit.Assert.*;

public class Testnull_43099 {
    private final Productionnull_43099 production = new Productionnull_43099("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}