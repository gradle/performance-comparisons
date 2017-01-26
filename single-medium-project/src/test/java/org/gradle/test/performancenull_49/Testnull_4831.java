package org.gradle.test.performancenull_49;

import static org.junit.Assert.*;

public class Testnull_4831 {
    private final Productionnull_4831 production = new Productionnull_4831("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}