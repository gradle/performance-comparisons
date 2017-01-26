package org.gradle.test.performancenull_260;

import static org.junit.Assert.*;

public class Testnull_25923 {
    private final Productionnull_25923 production = new Productionnull_25923("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}