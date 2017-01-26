package org.gradle.test.performancenull_230;

import static org.junit.Assert.*;

public class Testnull_22965 {
    private final Productionnull_22965 production = new Productionnull_22965("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}