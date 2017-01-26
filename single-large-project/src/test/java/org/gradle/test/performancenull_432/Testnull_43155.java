package org.gradle.test.performancenull_432;

import static org.junit.Assert.*;

public class Testnull_43155 {
    private final Productionnull_43155 production = new Productionnull_43155("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}