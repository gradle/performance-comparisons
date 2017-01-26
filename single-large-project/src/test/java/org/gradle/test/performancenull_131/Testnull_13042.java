package org.gradle.test.performancenull_131;

import static org.junit.Assert.*;

public class Testnull_13042 {
    private final Productionnull_13042 production = new Productionnull_13042("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}