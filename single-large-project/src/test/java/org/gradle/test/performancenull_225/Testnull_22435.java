package org.gradle.test.performancenull_225;

import static org.junit.Assert.*;

public class Testnull_22435 {
    private final Productionnull_22435 production = new Productionnull_22435("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}