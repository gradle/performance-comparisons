package org.gradle.test.performancenull_111;

import static org.junit.Assert.*;

public class Testnull_11081 {
    private final Productionnull_11081 production = new Productionnull_11081("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}