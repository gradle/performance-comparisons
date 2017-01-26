package org.gradle.test.performancenull_180;

import static org.junit.Assert.*;

public class Testnull_17937 {
    private final Productionnull_17937 production = new Productionnull_17937("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}