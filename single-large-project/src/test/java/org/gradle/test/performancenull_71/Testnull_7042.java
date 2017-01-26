package org.gradle.test.performancenull_71;

import static org.junit.Assert.*;

public class Testnull_7042 {
    private final Productionnull_7042 production = new Productionnull_7042("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}