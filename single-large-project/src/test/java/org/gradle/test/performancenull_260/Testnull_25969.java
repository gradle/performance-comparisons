package org.gradle.test.performancenull_260;

import static org.junit.Assert.*;

public class Testnull_25969 {
    private final Productionnull_25969 production = new Productionnull_25969("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}