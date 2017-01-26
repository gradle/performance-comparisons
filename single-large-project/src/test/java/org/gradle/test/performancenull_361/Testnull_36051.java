package org.gradle.test.performancenull_361;

import static org.junit.Assert.*;

public class Testnull_36051 {
    private final Productionnull_36051 production = new Productionnull_36051("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}