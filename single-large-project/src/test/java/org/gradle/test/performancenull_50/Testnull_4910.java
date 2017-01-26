package org.gradle.test.performancenull_50;

import static org.junit.Assert.*;

public class Testnull_4910 {
    private final Productionnull_4910 production = new Productionnull_4910("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}