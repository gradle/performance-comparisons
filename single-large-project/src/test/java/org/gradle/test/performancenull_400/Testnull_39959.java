package org.gradle.test.performancenull_400;

import static org.junit.Assert.*;

public class Testnull_39959 {
    private final Productionnull_39959 production = new Productionnull_39959("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}