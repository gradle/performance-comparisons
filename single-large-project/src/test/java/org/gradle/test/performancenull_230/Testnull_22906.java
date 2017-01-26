package org.gradle.test.performancenull_230;

import static org.junit.Assert.*;

public class Testnull_22906 {
    private final Productionnull_22906 production = new Productionnull_22906("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}