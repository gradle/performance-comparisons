package org.gradle.test.performancenull_403;

import static org.junit.Assert.*;

public class Testnull_40293 {
    private final Productionnull_40293 production = new Productionnull_40293("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}