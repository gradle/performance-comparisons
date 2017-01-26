package org.gradle.test.performancenull_430;

import static org.junit.Assert.*;

public class Testnull_42970 {
    private final Productionnull_42970 production = new Productionnull_42970("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}