package org.gradle.test.performancenull_341;

import static org.junit.Assert.*;

public class Testnull_34062 {
    private final Productionnull_34062 production = new Productionnull_34062("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}