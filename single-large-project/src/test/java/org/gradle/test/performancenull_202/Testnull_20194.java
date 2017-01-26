package org.gradle.test.performancenull_202;

import static org.junit.Assert.*;

public class Testnull_20194 {
    private final Productionnull_20194 production = new Productionnull_20194("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}