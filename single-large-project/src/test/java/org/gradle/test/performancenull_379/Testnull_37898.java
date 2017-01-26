package org.gradle.test.performancenull_379;

import static org.junit.Assert.*;

public class Testnull_37898 {
    private final Productionnull_37898 production = new Productionnull_37898("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}