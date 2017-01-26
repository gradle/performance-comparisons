package org.gradle.test.performancenull_200;

import static org.junit.Assert.*;

public class Testnull_19985 {
    private final Productionnull_19985 production = new Productionnull_19985("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}