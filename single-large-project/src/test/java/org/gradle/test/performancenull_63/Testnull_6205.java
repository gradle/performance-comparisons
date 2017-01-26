package org.gradle.test.performancenull_63;

import static org.junit.Assert.*;

public class Testnull_6205 {
    private final Productionnull_6205 production = new Productionnull_6205("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}