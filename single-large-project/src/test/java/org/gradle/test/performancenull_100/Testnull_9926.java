package org.gradle.test.performancenull_100;

import static org.junit.Assert.*;

public class Testnull_9926 {
    private final Productionnull_9926 production = new Productionnull_9926("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}