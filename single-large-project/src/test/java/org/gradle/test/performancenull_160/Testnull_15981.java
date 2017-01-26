package org.gradle.test.performancenull_160;

import static org.junit.Assert.*;

public class Testnull_15981 {
    private final Productionnull_15981 production = new Productionnull_15981("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}