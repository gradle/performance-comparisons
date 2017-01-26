package org.gradle.test.performancenull_491;

import static org.junit.Assert.*;

public class Testnull_49078 {
    private final Productionnull_49078 production = new Productionnull_49078("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}