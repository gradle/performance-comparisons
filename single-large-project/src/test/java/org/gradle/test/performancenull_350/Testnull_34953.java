package org.gradle.test.performancenull_350;

import static org.junit.Assert.*;

public class Testnull_34953 {
    private final Productionnull_34953 production = new Productionnull_34953("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}