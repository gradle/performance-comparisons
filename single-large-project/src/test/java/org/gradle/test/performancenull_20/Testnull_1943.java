package org.gradle.test.performancenull_20;

import static org.junit.Assert.*;

public class Testnull_1943 {
    private final Productionnull_1943 production = new Productionnull_1943("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}