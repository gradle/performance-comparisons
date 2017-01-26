package org.gradle.test.performancenull_260;

import static org.junit.Assert.*;

public class Testnull_25913 {
    private final Productionnull_25913 production = new Productionnull_25913("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}