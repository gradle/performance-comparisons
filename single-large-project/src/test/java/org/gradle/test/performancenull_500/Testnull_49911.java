package org.gradle.test.performancenull_500;

import static org.junit.Assert.*;

public class Testnull_49911 {
    private final Productionnull_49911 production = new Productionnull_49911("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}