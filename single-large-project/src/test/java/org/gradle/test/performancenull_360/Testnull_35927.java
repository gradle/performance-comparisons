package org.gradle.test.performancenull_360;

import static org.junit.Assert.*;

public class Testnull_35927 {
    private final Productionnull_35927 production = new Productionnull_35927("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}