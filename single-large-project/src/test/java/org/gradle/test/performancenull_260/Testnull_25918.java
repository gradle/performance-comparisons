package org.gradle.test.performancenull_260;

import static org.junit.Assert.*;

public class Testnull_25918 {
    private final Productionnull_25918 production = new Productionnull_25918("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}