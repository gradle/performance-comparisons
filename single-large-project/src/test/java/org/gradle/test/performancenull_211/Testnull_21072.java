package org.gradle.test.performancenull_211;

import static org.junit.Assert.*;

public class Testnull_21072 {
    private final Productionnull_21072 production = new Productionnull_21072("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}