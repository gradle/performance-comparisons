package org.gradle.test.performancenull_431;

import static org.junit.Assert.*;

public class Testnull_43027 {
    private final Productionnull_43027 production = new Productionnull_43027("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}