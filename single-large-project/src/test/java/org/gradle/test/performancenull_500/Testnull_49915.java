package org.gradle.test.performancenull_500;

import static org.junit.Assert.*;

public class Testnull_49915 {
    private final Productionnull_49915 production = new Productionnull_49915("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}