package org.gradle.test.performancenull_100;

import static org.junit.Assert.*;

public class Testnull_9929 {
    private final Productionnull_9929 production = new Productionnull_9929("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}