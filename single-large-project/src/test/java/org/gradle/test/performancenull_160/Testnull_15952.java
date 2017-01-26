package org.gradle.test.performancenull_160;

import static org.junit.Assert.*;

public class Testnull_15952 {
    private final Productionnull_15952 production = new Productionnull_15952("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}