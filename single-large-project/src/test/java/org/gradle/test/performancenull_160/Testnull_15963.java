package org.gradle.test.performancenull_160;

import static org.junit.Assert.*;

public class Testnull_15963 {
    private final Productionnull_15963 production = new Productionnull_15963("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}