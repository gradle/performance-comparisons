package org.gradle.test.performancenull_36;

import static org.junit.Assert.*;

public class Testnull_3594 {
    private final Productionnull_3594 production = new Productionnull_3594("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}