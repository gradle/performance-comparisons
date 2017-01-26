package org.gradle.test.performancenull_379;

import static org.junit.Assert.*;

public class Testnull_37843 {
    private final Productionnull_37843 production = new Productionnull_37843("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}