package org.gradle.test.performancenull_50;

import static org.junit.Assert.*;

public class Testnull_4927 {
    private final Productionnull_4927 production = new Productionnull_4927("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}