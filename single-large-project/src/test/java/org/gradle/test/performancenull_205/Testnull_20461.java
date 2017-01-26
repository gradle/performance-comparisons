package org.gradle.test.performancenull_205;

import static org.junit.Assert.*;

public class Testnull_20461 {
    private final Productionnull_20461 production = new Productionnull_20461("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}