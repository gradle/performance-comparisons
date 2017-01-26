package org.gradle.test.performancenull_361;

import static org.junit.Assert.*;

public class Testnull_36091 {
    private final Productionnull_36091 production = new Productionnull_36091("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}