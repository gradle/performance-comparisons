package org.gradle.test.performancenull_313;

import static org.junit.Assert.*;

public class Testnull_31242 {
    private final Productionnull_31242 production = new Productionnull_31242("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}