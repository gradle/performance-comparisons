package org.gradle.test.performancenull_379;

import static org.junit.Assert.*;

public class Testnull_37832 {
    private final Productionnull_37832 production = new Productionnull_37832("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}