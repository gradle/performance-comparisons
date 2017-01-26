package org.gradle.test.performancenull_6;

import static org.junit.Assert.*;

public class Testnull_502 {
    private final Productionnull_502 production = new Productionnull_502("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}