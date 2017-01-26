package org.gradle.test.performancenull_258;

import static org.junit.Assert.*;

public class Testnull_25703 {
    private final Productionnull_25703 production = new Productionnull_25703("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}