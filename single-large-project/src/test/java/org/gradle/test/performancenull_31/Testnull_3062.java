package org.gradle.test.performancenull_31;

import static org.junit.Assert.*;

public class Testnull_3062 {
    private final Productionnull_3062 production = new Productionnull_3062("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}