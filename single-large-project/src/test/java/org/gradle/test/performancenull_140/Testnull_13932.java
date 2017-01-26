package org.gradle.test.performancenull_140;

import static org.junit.Assert.*;

public class Testnull_13932 {
    private final Productionnull_13932 production = new Productionnull_13932("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}