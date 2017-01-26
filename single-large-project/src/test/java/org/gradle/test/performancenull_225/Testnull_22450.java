package org.gradle.test.performancenull_225;

import static org.junit.Assert.*;

public class Testnull_22450 {
    private final Productionnull_22450 production = new Productionnull_22450("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}