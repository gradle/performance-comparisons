package org.gradle.test.performancenull_92;

import static org.junit.Assert.*;

public class Testnull_9190 {
    private final Productionnull_9190 production = new Productionnull_9190("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}