package org.gradle.test.performancenull_120;

import static org.junit.Assert.*;

public class Testnull_11964 {
    private final Productionnull_11964 production = new Productionnull_11964("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}