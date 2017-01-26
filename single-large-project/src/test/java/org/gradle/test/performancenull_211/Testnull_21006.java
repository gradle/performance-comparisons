package org.gradle.test.performancenull_211;

import static org.junit.Assert.*;

public class Testnull_21006 {
    private final Productionnull_21006 production = new Productionnull_21006("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}