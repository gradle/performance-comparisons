package org.gradle.test.performancenull_260;

import static org.junit.Assert.*;

public class Testnull_25943 {
    private final Productionnull_25943 production = new Productionnull_25943("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}