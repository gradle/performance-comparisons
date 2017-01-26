package org.gradle.test.performancenull_100;

import static org.junit.Assert.*;

public class Testnull_9962 {
    private final Productionnull_9962 production = new Productionnull_9962("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}