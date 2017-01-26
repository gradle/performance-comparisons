package org.gradle.test.performancenull_175;

import static org.junit.Assert.*;

public class Testnull_17426 {
    private final Productionnull_17426 production = new Productionnull_17426("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}