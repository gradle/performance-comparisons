package org.gradle.test.performancenull_260;

import static org.junit.Assert.*;

public class Testnull_25964 {
    private final Productionnull_25964 production = new Productionnull_25964("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}