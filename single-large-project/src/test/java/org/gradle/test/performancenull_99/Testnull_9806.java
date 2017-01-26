package org.gradle.test.performancenull_99;

import static org.junit.Assert.*;

public class Testnull_9806 {
    private final Productionnull_9806 production = new Productionnull_9806("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}