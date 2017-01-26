package org.gradle.test.performancenull_484;

import static org.junit.Assert.*;

public class Testnull_48395 {
    private final Productionnull_48395 production = new Productionnull_48395("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}