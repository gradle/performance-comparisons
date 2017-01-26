package org.gradle.test.performancenull_225;

import static org.junit.Assert.*;

public class Testnull_22434 {
    private final Productionnull_22434 production = new Productionnull_22434("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}