package org.gradle.test.performancenull_71;

import static org.junit.Assert.*;

public class Testnull_7099 {
    private final Productionnull_7099 production = new Productionnull_7099("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}