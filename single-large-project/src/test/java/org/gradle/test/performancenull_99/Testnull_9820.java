package org.gradle.test.performancenull_99;

import static org.junit.Assert.*;

public class Testnull_9820 {
    private final Productionnull_9820 production = new Productionnull_9820("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}