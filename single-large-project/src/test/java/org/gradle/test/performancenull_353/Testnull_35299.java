package org.gradle.test.performancenull_353;

import static org.junit.Assert.*;

public class Testnull_35299 {
    private final Productionnull_35299 production = new Productionnull_35299("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}