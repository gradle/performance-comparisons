package org.gradle.test.performancenull_36;

import static org.junit.Assert.*;

public class Testnull_3599 {
    private final Productionnull_3599 production = new Productionnull_3599("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}