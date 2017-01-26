package org.gradle.test.performancenull_379;

import static org.junit.Assert.*;

public class Testnull_37830 {
    private final Productionnull_37830 production = new Productionnull_37830("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}