package org.gradle.test.performancenull_160;

import static org.junit.Assert.*;

public class Testnull_15906 {
    private final Productionnull_15906 production = new Productionnull_15906("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}