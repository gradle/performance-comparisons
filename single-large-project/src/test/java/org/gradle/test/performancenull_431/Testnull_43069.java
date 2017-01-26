package org.gradle.test.performancenull_431;

import static org.junit.Assert.*;

public class Testnull_43069 {
    private final Productionnull_43069 production = new Productionnull_43069("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}