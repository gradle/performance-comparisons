package org.gradle.test.performancenull_500;

import static org.junit.Assert.*;

public class Testnull_49965 {
    private final Productionnull_49965 production = new Productionnull_49965("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}