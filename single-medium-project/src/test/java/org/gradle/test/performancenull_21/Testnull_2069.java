package org.gradle.test.performancenull_21;

import static org.junit.Assert.*;

public class Testnull_2069 {
    private final Productionnull_2069 production = new Productionnull_2069("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}