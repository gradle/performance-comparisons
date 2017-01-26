package org.gradle.test.performancenull_500;

import static org.junit.Assert.*;

public class Testnull_49920 {
    private final Productionnull_49920 production = new Productionnull_49920("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}