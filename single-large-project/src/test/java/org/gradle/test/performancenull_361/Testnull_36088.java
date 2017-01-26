package org.gradle.test.performancenull_361;

import static org.junit.Assert.*;

public class Testnull_36088 {
    private final Productionnull_36088 production = new Productionnull_36088("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}