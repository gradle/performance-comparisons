package org.gradle.test.performancenull_180;

import static org.junit.Assert.*;

public class Testnull_17906 {
    private final Productionnull_17906 production = new Productionnull_17906("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}