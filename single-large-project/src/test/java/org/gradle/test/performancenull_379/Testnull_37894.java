package org.gradle.test.performancenull_379;

import static org.junit.Assert.*;

public class Testnull_37894 {
    private final Productionnull_37894 production = new Productionnull_37894("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}