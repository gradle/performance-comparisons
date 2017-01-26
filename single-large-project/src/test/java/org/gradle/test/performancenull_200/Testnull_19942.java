package org.gradle.test.performancenull_200;

import static org.junit.Assert.*;

public class Testnull_19942 {
    private final Productionnull_19942 production = new Productionnull_19942("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}