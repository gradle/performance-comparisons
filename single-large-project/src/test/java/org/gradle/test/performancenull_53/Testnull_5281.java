package org.gradle.test.performancenull_53;

import static org.junit.Assert.*;

public class Testnull_5281 {
    private final Productionnull_5281 production = new Productionnull_5281("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}