package org.gradle.test.performancenull_431;

import static org.junit.Assert.*;

public class Testnull_43036 {
    private final Productionnull_43036 production = new Productionnull_43036("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}