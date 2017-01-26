package org.gradle.test.performancenull_181;

import static org.junit.Assert.*;

public class Testnull_18081 {
    private final Productionnull_18081 production = new Productionnull_18081("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}