package org.gradle.test.performancenull_180;

import static org.junit.Assert.*;

public class Testnull_17985 {
    private final Productionnull_17985 production = new Productionnull_17985("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}