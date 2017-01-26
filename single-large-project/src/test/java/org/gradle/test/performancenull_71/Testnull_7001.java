package org.gradle.test.performancenull_71;

import static org.junit.Assert.*;

public class Testnull_7001 {
    private final Productionnull_7001 production = new Productionnull_7001("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}