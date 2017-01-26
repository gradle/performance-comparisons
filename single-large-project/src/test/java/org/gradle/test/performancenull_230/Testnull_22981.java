package org.gradle.test.performancenull_230;

import static org.junit.Assert.*;

public class Testnull_22981 {
    private final Productionnull_22981 production = new Productionnull_22981("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}