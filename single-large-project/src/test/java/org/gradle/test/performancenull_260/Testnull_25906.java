package org.gradle.test.performancenull_260;

import static org.junit.Assert.*;

public class Testnull_25906 {
    private final Productionnull_25906 production = new Productionnull_25906("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}