package org.gradle.test.performancenull_181;

import static org.junit.Assert.*;

public class Testnull_18097 {
    private final Productionnull_18097 production = new Productionnull_18097("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}