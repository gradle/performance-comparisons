package org.gradle.test.performancenull_121;

import static org.junit.Assert.*;

public class Testnull_12077 {
    private final Productionnull_12077 production = new Productionnull_12077("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}