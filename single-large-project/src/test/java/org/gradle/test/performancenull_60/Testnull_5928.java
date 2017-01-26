package org.gradle.test.performancenull_60;

import static org.junit.Assert.*;

public class Testnull_5928 {
    private final Productionnull_5928 production = new Productionnull_5928("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}