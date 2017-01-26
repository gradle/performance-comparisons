package org.gradle.test.performancenull_121;

import static org.junit.Assert.*;

public class Testnull_12081 {
    private final Productionnull_12081 production = new Productionnull_12081("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}