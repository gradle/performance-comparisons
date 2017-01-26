package org.gradle.test.performancenull_319;

import static org.junit.Assert.*;

public class Testnull_31871 {
    private final Productionnull_31871 production = new Productionnull_31871("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}