package org.gradle.test.performancenull_430;

import static org.junit.Assert.*;

public class Testnull_42964 {
    private final Productionnull_42964 production = new Productionnull_42964("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}