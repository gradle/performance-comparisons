package org.gradle.test.performancenull_220;

import static org.junit.Assert.*;

public class Testnull_21959 {
    private final Productionnull_21959 production = new Productionnull_21959("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}