package org.gradle.test.performancenull_218;

import static org.junit.Assert.*;

public class Testnull_21726 {
    private final Productionnull_21726 production = new Productionnull_21726("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}