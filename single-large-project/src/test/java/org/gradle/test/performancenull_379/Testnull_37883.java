package org.gradle.test.performancenull_379;

import static org.junit.Assert.*;

public class Testnull_37883 {
    private final Productionnull_37883 production = new Productionnull_37883("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}