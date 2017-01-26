package org.gradle.test.performancenull_319;

import static org.junit.Assert.*;

public class Testnull_31842 {
    private final Productionnull_31842 production = new Productionnull_31842("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}