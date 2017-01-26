package org.gradle.test.performancenull_331;

import static org.junit.Assert.*;

public class Testnull_33067 {
    private final Productionnull_33067 production = new Productionnull_33067("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}