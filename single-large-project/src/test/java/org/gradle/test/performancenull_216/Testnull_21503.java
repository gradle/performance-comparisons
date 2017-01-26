package org.gradle.test.performancenull_216;

import static org.junit.Assert.*;

public class Testnull_21503 {
    private final Productionnull_21503 production = new Productionnull_21503("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}