package org.gradle.test.performancenull_431;

import static org.junit.Assert.*;

public class Testnull_43051 {
    private final Productionnull_43051 production = new Productionnull_43051("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}