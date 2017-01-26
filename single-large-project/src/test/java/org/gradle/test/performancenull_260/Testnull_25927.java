package org.gradle.test.performancenull_260;

import static org.junit.Assert.*;

public class Testnull_25927 {
    private final Productionnull_25927 production = new Productionnull_25927("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}