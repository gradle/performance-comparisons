package org.gradle.test.performancenull_422;

import static org.junit.Assert.*;

public class Testnull_42176 {
    private final Productionnull_42176 production = new Productionnull_42176("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}