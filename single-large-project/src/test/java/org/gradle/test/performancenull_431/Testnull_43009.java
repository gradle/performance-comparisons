package org.gradle.test.performancenull_431;

import static org.junit.Assert.*;

public class Testnull_43009 {
    private final Productionnull_43009 production = new Productionnull_43009("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}