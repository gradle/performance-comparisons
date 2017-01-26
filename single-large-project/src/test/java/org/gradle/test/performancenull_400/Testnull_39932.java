package org.gradle.test.performancenull_400;

import static org.junit.Assert.*;

public class Testnull_39932 {
    private final Productionnull_39932 production = new Productionnull_39932("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}