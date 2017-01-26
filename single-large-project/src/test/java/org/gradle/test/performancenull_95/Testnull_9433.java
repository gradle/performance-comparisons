package org.gradle.test.performancenull_95;

import static org.junit.Assert.*;

public class Testnull_9433 {
    private final Productionnull_9433 production = new Productionnull_9433("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}