package org.gradle.test.performancenull_80;

import static org.junit.Assert.*;

public class Testnull_7953 {
    private final Productionnull_7953 production = new Productionnull_7953("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}