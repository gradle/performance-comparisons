package org.gradle.test.performancenull_400;

import static org.junit.Assert.*;

public class Testnull_39967 {
    private final Productionnull_39967 production = new Productionnull_39967("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}