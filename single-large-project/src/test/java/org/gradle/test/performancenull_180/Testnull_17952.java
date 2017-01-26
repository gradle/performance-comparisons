package org.gradle.test.performancenull_180;

import static org.junit.Assert.*;

public class Testnull_17952 {
    private final Productionnull_17952 production = new Productionnull_17952("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}