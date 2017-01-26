package org.gradle.test.performancenull_341;

import static org.junit.Assert.*;

public class Testnull_34086 {
    private final Productionnull_34086 production = new Productionnull_34086("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}