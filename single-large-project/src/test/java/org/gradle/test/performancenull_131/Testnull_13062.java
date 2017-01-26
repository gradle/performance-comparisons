package org.gradle.test.performancenull_131;

import static org.junit.Assert.*;

public class Testnull_13062 {
    private final Productionnull_13062 production = new Productionnull_13062("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}