package org.gradle.test.performancenull_162;

import static org.junit.Assert.*;

public class Testnull_16162 {
    private final Productionnull_16162 production = new Productionnull_16162("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}