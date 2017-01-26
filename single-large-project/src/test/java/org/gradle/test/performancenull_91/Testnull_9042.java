package org.gradle.test.performancenull_91;

import static org.junit.Assert.*;

public class Testnull_9042 {
    private final Productionnull_9042 production = new Productionnull_9042("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}