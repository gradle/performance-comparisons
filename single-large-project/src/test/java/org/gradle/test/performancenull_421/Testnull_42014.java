package org.gradle.test.performancenull_421;

import static org.junit.Assert.*;

public class Testnull_42014 {
    private final Productionnull_42014 production = new Productionnull_42014("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}