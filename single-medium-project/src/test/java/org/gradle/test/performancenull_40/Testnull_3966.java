package org.gradle.test.performancenull_40;

import static org.junit.Assert.*;

public class Testnull_3966 {
    private final Productionnull_3966 production = new Productionnull_3966("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}