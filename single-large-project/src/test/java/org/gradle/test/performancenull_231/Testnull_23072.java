package org.gradle.test.performancenull_231;

import static org.junit.Assert.*;

public class Testnull_23072 {
    private final Productionnull_23072 production = new Productionnull_23072("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}