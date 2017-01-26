package org.gradle.test.performancenull_421;

import static org.junit.Assert.*;

public class Testnull_42062 {
    private final Productionnull_42062 production = new Productionnull_42062("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}