package org.gradle.test.performancenull_415;

import static org.junit.Assert.*;

public class Testnull_41480 {
    private final Productionnull_41480 production = new Productionnull_41480("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}