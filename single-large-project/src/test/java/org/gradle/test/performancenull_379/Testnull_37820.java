package org.gradle.test.performancenull_379;

import static org.junit.Assert.*;

public class Testnull_37820 {
    private final Productionnull_37820 production = new Productionnull_37820("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}