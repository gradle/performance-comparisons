package org.gradle.test.performancenull_59;

import static org.junit.Assert.*;

public class Testnull_5820 {
    private final Productionnull_5820 production = new Productionnull_5820("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}