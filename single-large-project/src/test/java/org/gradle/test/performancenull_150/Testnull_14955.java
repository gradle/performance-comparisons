package org.gradle.test.performancenull_150;

import static org.junit.Assert.*;

public class Testnull_14955 {
    private final Productionnull_14955 production = new Productionnull_14955("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}