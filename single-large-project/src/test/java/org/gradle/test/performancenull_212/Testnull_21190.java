package org.gradle.test.performancenull_212;

import static org.junit.Assert.*;

public class Testnull_21190 {
    private final Productionnull_21190 production = new Productionnull_21190("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}