package org.gradle.test.performancenull_260;

import static org.junit.Assert.*;

public class Testnull_25946 {
    private final Productionnull_25946 production = new Productionnull_25946("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}