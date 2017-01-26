package org.gradle.test.performancenull_379;

import static org.junit.Assert.*;

public class Testnull_37822 {
    private final Productionnull_37822 production = new Productionnull_37822("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}