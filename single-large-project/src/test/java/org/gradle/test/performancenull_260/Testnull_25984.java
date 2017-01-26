package org.gradle.test.performancenull_260;

import static org.junit.Assert.*;

public class Testnull_25984 {
    private final Productionnull_25984 production = new Productionnull_25984("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}