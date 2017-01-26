package org.gradle.test.performancenull_101;

import static org.junit.Assert.*;

public class Testnull_10072 {
    private final Productionnull_10072 production = new Productionnull_10072("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}