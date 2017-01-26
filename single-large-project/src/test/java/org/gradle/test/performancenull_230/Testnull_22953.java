package org.gradle.test.performancenull_230;

import static org.junit.Assert.*;

public class Testnull_22953 {
    private final Productionnull_22953 production = new Productionnull_22953("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}