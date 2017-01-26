package org.gradle.test.performancenull_100;

import static org.junit.Assert.*;

public class Testnull_9902 {
    private final Productionnull_9902 production = new Productionnull_9902("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}