package org.gradle.test.performancenull_410;

import static org.junit.Assert.*;

public class Testnull_40963 {
    private final Productionnull_40963 production = new Productionnull_40963("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}