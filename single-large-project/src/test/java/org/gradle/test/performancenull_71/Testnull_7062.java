package org.gradle.test.performancenull_71;

import static org.junit.Assert.*;

public class Testnull_7062 {
    private final Productionnull_7062 production = new Productionnull_7062("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}