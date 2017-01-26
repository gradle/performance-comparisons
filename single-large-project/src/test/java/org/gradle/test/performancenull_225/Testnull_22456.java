package org.gradle.test.performancenull_225;

import static org.junit.Assert.*;

public class Testnull_22456 {
    private final Productionnull_22456 production = new Productionnull_22456("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}