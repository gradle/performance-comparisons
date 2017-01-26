package org.gradle.test.performancenull_489;

import static org.junit.Assert.*;

public class Testnull_48823 {
    private final Productionnull_48823 production = new Productionnull_48823("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}