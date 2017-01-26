package org.gradle.test.performancenull_11;

import static org.junit.Assert.*;

public class Testnull_1062 {
    private final Productionnull_1062 production = new Productionnull_1062("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}