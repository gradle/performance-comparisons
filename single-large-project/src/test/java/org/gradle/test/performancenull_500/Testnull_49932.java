package org.gradle.test.performancenull_500;

import static org.junit.Assert.*;

public class Testnull_49932 {
    private final Productionnull_49932 production = new Productionnull_49932("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}