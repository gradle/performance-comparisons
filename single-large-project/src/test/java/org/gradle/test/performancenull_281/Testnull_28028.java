package org.gradle.test.performancenull_281;

import static org.junit.Assert.*;

public class Testnull_28028 {
    private final Productionnull_28028 production = new Productionnull_28028("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}