package org.gradle.test.performancenull_431;

import static org.junit.Assert.*;

public class Testnull_43081 {
    private final Productionnull_43081 production = new Productionnull_43081("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}