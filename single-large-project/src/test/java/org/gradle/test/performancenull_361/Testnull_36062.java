package org.gradle.test.performancenull_361;

import static org.junit.Assert.*;

public class Testnull_36062 {
    private final Productionnull_36062 production = new Productionnull_36062("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}