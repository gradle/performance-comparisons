package org.gradle.test.performancenull_405;

import static org.junit.Assert.*;

public class Testnull_40475 {
    private final Productionnull_40475 production = new Productionnull_40475("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}