package org.gradle.test.performancenull_231;

import static org.junit.Assert.*;

public class Testnull_23078 {
    private final Productionnull_23078 production = new Productionnull_23078("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}