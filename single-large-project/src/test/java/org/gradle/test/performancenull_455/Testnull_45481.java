package org.gradle.test.performancenull_455;

import static org.junit.Assert.*;

public class Testnull_45481 {
    private final Productionnull_45481 production = new Productionnull_45481("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}