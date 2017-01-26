package org.gradle.test.performancenull_7;

import static org.junit.Assert.*;

public class Testnull_700 {
    private final Productionnull_700 production = new Productionnull_700("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}