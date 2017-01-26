package org.gradle.test.performancenull_311;

import static org.junit.Assert.*;

public class Testnull_31072 {
    private final Productionnull_31072 production = new Productionnull_31072("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}