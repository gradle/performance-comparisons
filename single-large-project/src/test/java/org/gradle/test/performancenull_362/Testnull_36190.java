package org.gradle.test.performancenull_362;

import static org.junit.Assert.*;

public class Testnull_36190 {
    private final Productionnull_36190 production = new Productionnull_36190("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}