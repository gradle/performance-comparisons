package org.gradle.test.performancenull_80;

import static org.junit.Assert.*;

public class Testnull_7906 {
    private final Productionnull_7906 production = new Productionnull_7906("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}