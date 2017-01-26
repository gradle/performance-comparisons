package org.gradle.test.performancenull_141;

import static org.junit.Assert.*;

public class Testnull_14062 {
    private final Productionnull_14062 production = new Productionnull_14062("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}