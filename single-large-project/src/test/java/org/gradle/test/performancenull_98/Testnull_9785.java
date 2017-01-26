package org.gradle.test.performancenull_98;

import static org.junit.Assert.*;

public class Testnull_9785 {
    private final Productionnull_9785 production = new Productionnull_9785("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}