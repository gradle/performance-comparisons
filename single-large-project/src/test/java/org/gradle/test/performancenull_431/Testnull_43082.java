package org.gradle.test.performancenull_431;

import static org.junit.Assert.*;

public class Testnull_43082 {
    private final Productionnull_43082 production = new Productionnull_43082("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}