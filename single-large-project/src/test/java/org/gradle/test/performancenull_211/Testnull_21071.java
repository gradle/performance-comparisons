package org.gradle.test.performancenull_211;

import static org.junit.Assert.*;

public class Testnull_21071 {
    private final Productionnull_21071 production = new Productionnull_21071("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}