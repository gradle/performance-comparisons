package org.gradle.test.performancenull_191;

import static org.junit.Assert.*;

public class Testnull_19093 {
    private final Productionnull_19093 production = new Productionnull_19093("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}