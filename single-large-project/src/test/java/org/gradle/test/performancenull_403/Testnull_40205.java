package org.gradle.test.performancenull_403;

import static org.junit.Assert.*;

public class Testnull_40205 {
    private final Productionnull_40205 production = new Productionnull_40205("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}