package org.gradle.test.performancenull_53;

import static org.junit.Assert.*;

public class Testnull_5213 {
    private final Productionnull_5213 production = new Productionnull_5213("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}