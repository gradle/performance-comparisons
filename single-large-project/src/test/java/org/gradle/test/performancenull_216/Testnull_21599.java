package org.gradle.test.performancenull_216;

import static org.junit.Assert.*;

public class Testnull_21599 {
    private final Productionnull_21599 production = new Productionnull_21599("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}