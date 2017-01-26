package org.gradle.test.performancenull_260;

import static org.junit.Assert.*;

public class Testnull_25952 {
    private final Productionnull_25952 production = new Productionnull_25952("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}