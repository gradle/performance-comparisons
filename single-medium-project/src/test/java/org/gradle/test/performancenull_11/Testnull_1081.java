package org.gradle.test.performancenull_11;

import static org.junit.Assert.*;

public class Testnull_1081 {
    private final Productionnull_1081 production = new Productionnull_1081("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}