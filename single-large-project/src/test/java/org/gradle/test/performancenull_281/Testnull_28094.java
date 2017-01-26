package org.gradle.test.performancenull_281;

import static org.junit.Assert.*;

public class Testnull_28094 {
    private final Productionnull_28094 production = new Productionnull_28094("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}