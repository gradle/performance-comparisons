package org.gradle.test.performancenull_431;

import static org.junit.Assert.*;

public class Testnull_43097 {
    private final Productionnull_43097 production = new Productionnull_43097("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}