package org.gradle.test.performancenull_182;

import static org.junit.Assert.*;

public class Testnull_18101 {
    private final Productionnull_18101 production = new Productionnull_18101("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}