package org.gradle.test.performancenull_93;

import static org.junit.Assert.*;

public class Testnull_9300 {
    private final Productionnull_9300 production = new Productionnull_9300("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}