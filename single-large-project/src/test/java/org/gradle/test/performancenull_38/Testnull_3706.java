package org.gradle.test.performancenull_38;

import static org.junit.Assert.*;

public class Testnull_3706 {
    private final Productionnull_3706 production = new Productionnull_3706("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}