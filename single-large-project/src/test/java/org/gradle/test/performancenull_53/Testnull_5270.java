package org.gradle.test.performancenull_53;

import static org.junit.Assert.*;

public class Testnull_5270 {
    private final Productionnull_5270 production = new Productionnull_5270("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}