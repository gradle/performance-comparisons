package org.gradle.test.performancenull_98;

import static org.junit.Assert.*;

public class Testnull_9769 {
    private final Productionnull_9769 production = new Productionnull_9769("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}