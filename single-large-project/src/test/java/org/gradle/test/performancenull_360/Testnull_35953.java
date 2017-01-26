package org.gradle.test.performancenull_360;

import static org.junit.Assert.*;

public class Testnull_35953 {
    private final Productionnull_35953 production = new Productionnull_35953("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}