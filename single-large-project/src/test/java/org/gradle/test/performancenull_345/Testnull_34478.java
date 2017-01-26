package org.gradle.test.performancenull_345;

import static org.junit.Assert.*;

public class Testnull_34478 {
    private final Productionnull_34478 production = new Productionnull_34478("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}