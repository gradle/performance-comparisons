package org.gradle.test.performancenull_405;

import static org.junit.Assert.*;

public class Testnull_40480 {
    private final Productionnull_40480 production = new Productionnull_40480("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}