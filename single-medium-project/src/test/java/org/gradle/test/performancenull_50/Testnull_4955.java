package org.gradle.test.performancenull_50;

import static org.junit.Assert.*;

public class Testnull_4955 {
    private final Productionnull_4955 production = new Productionnull_4955("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}