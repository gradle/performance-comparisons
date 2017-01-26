package org.gradle.test.performancenull_225;

import static org.junit.Assert.*;

public class Testnull_22461 {
    private final Productionnull_22461 production = new Productionnull_22461("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}