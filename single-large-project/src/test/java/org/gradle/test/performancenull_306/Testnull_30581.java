package org.gradle.test.performancenull_306;

import static org.junit.Assert.*;

public class Testnull_30581 {
    private final Productionnull_30581 production = new Productionnull_30581("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}