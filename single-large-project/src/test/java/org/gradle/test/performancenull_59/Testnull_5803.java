package org.gradle.test.performancenull_59;

import static org.junit.Assert.*;

public class Testnull_5803 {
    private final Productionnull_5803 production = new Productionnull_5803("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}