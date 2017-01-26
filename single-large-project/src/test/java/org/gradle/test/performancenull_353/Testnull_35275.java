package org.gradle.test.performancenull_353;

import static org.junit.Assert.*;

public class Testnull_35275 {
    private final Productionnull_35275 production = new Productionnull_35275("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}