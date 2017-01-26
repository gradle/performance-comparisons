package org.gradle.test.performancenull_410;

import static org.junit.Assert.*;

public class Testnull_40906 {
    private final Productionnull_40906 production = new Productionnull_40906("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}