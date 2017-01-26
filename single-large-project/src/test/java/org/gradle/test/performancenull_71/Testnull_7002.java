package org.gradle.test.performancenull_71;

import static org.junit.Assert.*;

public class Testnull_7002 {
    private final Productionnull_7002 production = new Productionnull_7002("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}