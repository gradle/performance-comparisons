package org.gradle.test.performancenull_403;

import static org.junit.Assert.*;

public class Testnull_40229 {
    private final Productionnull_40229 production = new Productionnull_40229("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}