package org.gradle.test.performancenull_281;

import static org.junit.Assert.*;

public class Testnull_28009 {
    private final Productionnull_28009 production = new Productionnull_28009("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}