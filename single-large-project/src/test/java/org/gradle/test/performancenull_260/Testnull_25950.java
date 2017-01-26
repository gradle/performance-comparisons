package org.gradle.test.performancenull_260;

import static org.junit.Assert.*;

public class Testnull_25950 {
    private final Productionnull_25950 production = new Productionnull_25950("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}