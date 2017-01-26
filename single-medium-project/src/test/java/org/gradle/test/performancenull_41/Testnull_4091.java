package org.gradle.test.performancenull_41;

import static org.junit.Assert.*;

public class Testnull_4091 {
    private final Productionnull_4091 production = new Productionnull_4091("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}