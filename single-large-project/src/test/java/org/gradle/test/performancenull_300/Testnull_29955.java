package org.gradle.test.performancenull_300;

import static org.junit.Assert.*;

public class Testnull_29955 {
    private final Productionnull_29955 production = new Productionnull_29955("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}