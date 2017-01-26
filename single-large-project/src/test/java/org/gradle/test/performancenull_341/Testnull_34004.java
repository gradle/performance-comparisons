package org.gradle.test.performancenull_341;

import static org.junit.Assert.*;

public class Testnull_34004 {
    private final Productionnull_34004 production = new Productionnull_34004("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}