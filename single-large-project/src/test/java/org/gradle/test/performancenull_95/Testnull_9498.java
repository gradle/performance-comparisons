package org.gradle.test.performancenull_95;

import static org.junit.Assert.*;

public class Testnull_9498 {
    private final Productionnull_9498 production = new Productionnull_9498("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}