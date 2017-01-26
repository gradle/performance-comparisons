package org.gradle.test.performancenull_421;

import static org.junit.Assert.*;

public class Testnull_42009 {
    private final Productionnull_42009 production = new Productionnull_42009("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}