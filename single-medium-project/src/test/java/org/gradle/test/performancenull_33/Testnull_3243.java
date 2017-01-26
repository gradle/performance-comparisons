package org.gradle.test.performancenull_33;

import static org.junit.Assert.*;

public class Testnull_3243 {
    private final Productionnull_3243 production = new Productionnull_3243("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}