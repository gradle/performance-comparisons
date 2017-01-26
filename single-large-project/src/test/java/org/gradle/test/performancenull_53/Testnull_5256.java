package org.gradle.test.performancenull_53;

import static org.junit.Assert.*;

public class Testnull_5256 {
    private final Productionnull_5256 production = new Productionnull_5256("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}