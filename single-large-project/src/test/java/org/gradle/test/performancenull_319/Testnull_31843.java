package org.gradle.test.performancenull_319;

import static org.junit.Assert.*;

public class Testnull_31843 {
    private final Productionnull_31843 production = new Productionnull_31843("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}