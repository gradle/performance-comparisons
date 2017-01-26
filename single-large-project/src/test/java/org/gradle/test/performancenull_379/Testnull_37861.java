package org.gradle.test.performancenull_379;

import static org.junit.Assert.*;

public class Testnull_37861 {
    private final Productionnull_37861 production = new Productionnull_37861("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}