package org.gradle.test.performancenull_102;

import static org.junit.Assert.*;

public class Testnull_10190 {
    private final Productionnull_10190 production = new Productionnull_10190("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}