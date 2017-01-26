package org.gradle.test.performancenull_50;

import static org.junit.Assert.*;

public class Testnull_4933 {
    private final Productionnull_4933 production = new Productionnull_4933("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}