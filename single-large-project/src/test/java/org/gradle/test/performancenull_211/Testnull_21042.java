package org.gradle.test.performancenull_211;

import static org.junit.Assert.*;

public class Testnull_21042 {
    private final Productionnull_21042 production = new Productionnull_21042("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}