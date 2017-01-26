package org.gradle.test.performancenull_100;

import static org.junit.Assert.*;

public class Testnull_9943 {
    private final Productionnull_9943 production = new Productionnull_9943("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}