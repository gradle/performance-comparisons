package org.gradle.test.performancenull_498;

import static org.junit.Assert.*;

public class Testnull_49789 {
    private final Productionnull_49789 production = new Productionnull_49789("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}