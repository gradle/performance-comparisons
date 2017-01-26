package org.gradle.test.performancenull_337;

import static org.junit.Assert.*;

public class Testnull_33601 {
    private final Productionnull_33601 production = new Productionnull_33601("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}