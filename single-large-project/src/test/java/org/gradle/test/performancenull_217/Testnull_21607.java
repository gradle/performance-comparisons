package org.gradle.test.performancenull_217;

import static org.junit.Assert.*;

public class Testnull_21607 {
    private final Productionnull_21607 production = new Productionnull_21607("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}