package org.gradle.test.performancenull_100;

import static org.junit.Assert.*;

public class Testnull_9905 {
    private final Productionnull_9905 production = new Productionnull_9905("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}