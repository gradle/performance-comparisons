package org.gradle.test.performancenull_431;

import static org.junit.Assert.*;

public class Testnull_43041 {
    private final Productionnull_43041 production = new Productionnull_43041("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}