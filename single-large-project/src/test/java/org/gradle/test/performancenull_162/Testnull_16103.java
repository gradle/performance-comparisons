package org.gradle.test.performancenull_162;

import static org.junit.Assert.*;

public class Testnull_16103 {
    private final Productionnull_16103 production = new Productionnull_16103("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}