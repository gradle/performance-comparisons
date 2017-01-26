package org.gradle.test.performancenull_260;

import static org.junit.Assert.*;

public class Testnull_25908 {
    private final Productionnull_25908 production = new Productionnull_25908("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}