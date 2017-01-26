package org.gradle.test.performancenull_100;

import static org.junit.Assert.*;

public class Testnull_9903 {
    private final Productionnull_9903 production = new Productionnull_9903("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}