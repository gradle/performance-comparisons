package org.gradle.test.performancenull_422;

import static org.junit.Assert.*;

public class Testnull_42137 {
    private final Productionnull_42137 production = new Productionnull_42137("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}